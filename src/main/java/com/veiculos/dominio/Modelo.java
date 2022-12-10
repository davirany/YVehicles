package com.veiculos.dominio;

public class Modelo {
    private String nome;
    private Marca marca;

    public Modelo( String nome, Marca marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca.getNome();
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
