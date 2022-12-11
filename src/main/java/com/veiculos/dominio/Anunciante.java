package com.veiculos.dominio;

public class Anunciante extends Usuario{
    private int anunciosAtivos;
    public Anunciante(String nome, String telefone, String email, int anunciosAtivos) {
        super(nome, telefone, email);
    }

    public int getAnunciosAtivos() {
        return anunciosAtivos;
    }

    public void setAnunciosAtivos(int anunciosAtivos) {
        this.anunciosAtivos = anunciosAtivos;
    }
}
