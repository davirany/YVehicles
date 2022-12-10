package com.veiculos.dominio;

import java.util.Date;

public class Venda {
    private Veiculo veiculo;
    private String data;
    private Anunciante anunciante;
    private Comprador comprador;
    private int id;


    public Venda(Veiculo veiculo, String data, Anunciante anunciante, Comprador comprador, int id) {
        this.veiculo = veiculo;
        this.data = data;
        this.anunciante = anunciante;
        this.comprador = comprador;
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAnunciante() {
        return anunciante.getNome();
    }

    public void setAnunciante(Anunciante anunciante) {
        this.anunciante = anunciante;
    }

    public String getComprador() {
        return comprador.getNome();
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
}
