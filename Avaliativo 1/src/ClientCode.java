import model.TipoMassa;
import model.Pizza;
import model.TamanhoPizza;
import view.VisaoPizza;
import controller.ControlePizza;

public class ClientCode {
    public static void main(String[] args) {
        Pizza margherita = new Pizza.Construtor()
                .tamanho(TamanhoPizza.GRANDE)
                .tipoMassa(TipoMassa.FINA)
                .queijo("mussarela")
                .adicionarCobertura("tomate")
                .adicionarCobertura("manjericão")
                .construir();

        Pizza pepperoni = new Pizza.Construtor()
                .adicionarCobertura("pepperoni")
                .construir();

        Pizza.Construtor construtor = new Pizza.Construtor();
        Pizza vegetariana = construtor.tamanho(TamanhoPizza.PEQUENA)
                .tipoMassa(TipoMassa.INTEGRAL)
                .queijo("mussarela")
                .adicionarCobertura("pimentão")
                .adicionarCobertura("cebola")
                .adicionarCobertura("azeitona")
                .construir();

        construtor = new Pizza.Construtor();
        Pizza semGluten = construtor.tipoMassa(TipoMassa.SEM_GLUTEN)
                .queijo("Queijo Vegano")
                .adicionarCobertura("tomate")
                .adicionarCobertura("rúcula")
                .adicionarCobertura("cogumelos")
                .construir();

        VisaoPizza visao = new VisaoPizza();

        ControlePizza controle1 = new ControlePizza(margherita, visao);
        ControlePizza controle2 = new ControlePizza(pepperoni, visao);
        ControlePizza controle3 = new ControlePizza(vegetariana, visao);
        ControlePizza controle4 = new ControlePizza(semGluten, visao);

        controle1.atualizarVisao();
        controle2.atualizarVisao();
        controle3.atualizarVisao();
        controle4.atualizarVisao();
    }
}
