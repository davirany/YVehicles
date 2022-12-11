package com.veiculos.dominio;

import java.util.Collections;
import java.util.List;

public class Anuncio {
    private int id;
    private String descricao;
    private Anunciante anunciante;
    private Veiculo veiculo;

    public Anuncio(int id, String descricao, Anunciante anunciante, Veiculo veiculo) {
        this.id = id;
        this.descricao = descricao;
        this.anunciante = anunciante;
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Anunciante getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(Anunciante anunciante) {
        this.anunciante = anunciante;
    }

    public List<Anuncio> consultar() {

        return Collections.emptyList();
    }
}
