package com.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter @Getter
public class Anuncio {
    private Carro carro;
    private LocalDate data;
    private String loja;
    private int donos;
    private int preco;

    public Anuncio() {}
}

