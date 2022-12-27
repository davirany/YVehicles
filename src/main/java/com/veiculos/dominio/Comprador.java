package com.veiculos.dominio;

public class Comprador extends Usuario{
    private int qtdCarrosComprados;

    public Comprador(String nome, String telefone, String email, int qtdCarrosComprados) {
        super(nome, telefone, email);
    }

    public int getQtdCarrosComprados() {
        return qtdCarrosComprados;
    }

    public void setQtdCarrosComprados(int qtdCarrosComprados) {
        this.qtdCarrosComprados = qtdCarrosComprados;
    }
}
