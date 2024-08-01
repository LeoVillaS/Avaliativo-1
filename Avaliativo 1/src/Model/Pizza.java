package model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final TamanhoPizza tamanho;
    private final TipoMassa tipoMassa;
    private final String queijo;
    private final List<String> coberturas;

    private Pizza(TamanhoPizza tamanho, TipoMassa tipoMassa, String queijo, List<String> coberturas) {
        this.tamanho = tamanho;
        this.tipoMassa = tipoMassa;
        this.queijo = queijo;
        this.coberturas = coberturas;
    }

    public TamanhoPizza getTamanho() {
        return tamanho;
    }

    public TipoMassa getTipoMassa() {
        return tipoMassa;
    }

    public String getQueijo() {
        return queijo;
    }

    public List<String> getCoberturas() {
        return coberturas;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamanho=" + tamanho +
                ", tipoMassa=" + tipoMassa +
                ", queijo='" + queijo + '\'' +
                ", coberturas=" + coberturas +
                '}';
    }

    public static class Construtor {
        private TamanhoPizza tamanho = TamanhoPizza.PADRAO;
        private TipoMassa tipoMassa = TipoMassa.FINA;
        private String queijo = "mussarela";
        private List<String> coberturas = new ArrayList<>();

        public Construtor tamanho(TamanhoPizza tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public Construtor tipoMassa(TipoMassa tipoMassa) {
            this.tipoMassa = tipoMassa;
            return this;
        }

        public Construtor queijo(String queijo) {
            this.queijo = queijo;
            return this;
        }

        public Construtor adicionarCobertura(String cobertura) {
            this.coberturas.add(cobertura);
            return this;
        }

        public Pizza construir() {
            return new Pizza(tamanho, tipoMassa, queijo, coberturas);
        }
    }
}
