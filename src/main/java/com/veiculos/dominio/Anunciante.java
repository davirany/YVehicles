package com.veiculos.dominio;

public class Anunciante extends Usuario{
    private int anunciosAtivos;
    private int carrosVendidos;

    public Anunciante(String nome, String telefone, String email, int anunciosAtivos, int carrosVendidos) {
        super(nome, telefone, email);
        this.anunciosAtivos = anunciosAtivos;
        this.carrosVendidos = carrosVendidos;
    }

    public int getAnunciosAtivos() {
        return anunciosAtivos;
    }

    public void setAnunciosAtivos(int anunciosAtivos) {
        this.anunciosAtivos = anunciosAtivos;
    }

    public int getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(int carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }
}
