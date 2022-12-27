package com.veiculos.dominio;

public class Anunciante extends Usuario{
    private int qtdAnunciosAtivos;
    private int qtsCarrosVendidos;

    public Anunciante(String nome, String telefone, String email, int qtdAnunciosAtivos, int qtsCarrosVendidos) {
        super(nome, telefone, email);
        this.qtdAnunciosAtivos = qtdAnunciosAtivos;
        this.qtsCarrosVendidos = qtsCarrosVendidos;
    }

    public int getQtdAnunciosAtivos() {
        return qtdAnunciosAtivos;
    }

    public void setQtdAnunciosAtivos(int qtdAnunciosAtivos) {
        this.qtdAnunciosAtivos = qtdAnunciosAtivos;
    }

    public int getQtsCarrosVendidos() {
        return qtsCarrosVendidos;
    }

    public void setQtsCarrosVendidos(int qtsCarrosVendidos) {
        this.qtsCarrosVendidos = qtsCarrosVendidos;
    }

}
