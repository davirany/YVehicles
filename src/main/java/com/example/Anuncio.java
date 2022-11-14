package com.example;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Anuncio {
    private String ano;
    private String cambio;
    private String cor;
    private String loja;
    private String marca;
    private String modelo;
    private int preco;
    private int quilometragem;

    public Anuncio(String ano, String cambio, String cor, String loja, String marca, String modelo, int preco, int quilometragem) {
        this.ano = ano;
        this.cambio = cambio;
        this.cor = cor;
        this.loja = loja;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.quilometragem = quilometragem;
    }

    public Anuncio() {}

}

