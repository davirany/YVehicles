package com.veiculos.dominio;


import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

public class Veiculo {
    private Modelo modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private int quilometragem;
    private int preco;
    private int id;

    public Veiculo(Modelo modelo, int anoFabricacao, int anoModelo, String cor, int quilometragem, int preco, int id) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.preco = preco;
        this.id = id;
    }

    public List<Veiculo> listarVeiculos() {

        return Collections.emptyList();
    }

    public List<Veiculo> listarPorPreco(BigInteger menorValorPreco, BigInteger maiorValorPreco) {

        return Collections.emptyList();
    }

    public List<Veiculo> listarPorMarca(Marca marca) {

        return Collections.emptyList();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
