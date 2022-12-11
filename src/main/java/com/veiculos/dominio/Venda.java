package com.veiculos.dominio;


public class Venda {
    private Anuncio anuncio;
    private String data;
    private Comprador comprador;
    private int id;

    public Venda(Anuncio anuncio, String data, Comprador comprador, int id) {
        this.anuncio = anuncio;
        this.data = data;
        this.comprador = comprador;
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
}
