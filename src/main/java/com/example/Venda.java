package com.example;

public class Venda {
    private Carro carro;
    private String data;
    private String loja;
    private int antigosDonos;
    private Anunciante anunciante;
    private Comprador comprador;

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public int getAntigosDonos() {
        return antigosDonos;
    }

    public void setAntigosDonos(int antigosDonos) {
        this.antigosDonos = antigosDonos;
    }

    public Anunciante getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(Anunciante anunciante) {
        this.anunciante = anunciante;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }
}
