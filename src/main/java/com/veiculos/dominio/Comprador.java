package com.veiculos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Comprador extends Usuario{
    private int qtdCarrosComprados;
    private List<Veiculo> veiculosComprados = new ArrayList<Veiculo>();

    public Comprador(String nome, String telefone, String email, int qtdCarrosComprados, List<Veiculo> veiculosComprados) {
        super(nome, telefone, email);
        this.qtdCarrosComprados = qtdCarrosComprados;
        this.veiculosComprados = veiculosComprados;
    }

    public Comprador(String nome, String telefone, String email, int qtdCarrosComprados) {
        super(nome, telefone, email);
        this.qtdCarrosComprados = qtdCarrosComprados;
    }

    public int getQtdCarrosComprados() {
        return qtdCarrosComprados;
    }

    public void setQtdCarrosComprados(int qtdCarrosComprados) {
        this.qtdCarrosComprados = qtdCarrosComprados;
    }

    public List<Veiculo> getVeiculosComprados() {
        return veiculosComprados;
    }

    public void setVeiculosComprados(List<Veiculo> veiculosComprados) {
        this.veiculosComprados = veiculosComprados;
    }

    public List<Veiculo> listaVeiculosComprados() {
        return veiculosComprados;
    }

    public void adicionarCarroComprado (Veiculo veiculo) {
        veiculosComprados.add(veiculo);
    }
}
