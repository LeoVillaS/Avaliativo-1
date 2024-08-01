package controller;

import model.Pizza;
import view.VisaoPizza;

public class ControlePizza {
    private final Pizza pizza;
    private final VisaoPizza visao;

    public ControlePizza(Pizza pizza, VisaoPizza visao) {
        this.pizza = pizza;
        this.visao = visao;
    }

    public void atualizarVisao() {
        visao.exibirDetalhesPizza(pizza);
    }
}
