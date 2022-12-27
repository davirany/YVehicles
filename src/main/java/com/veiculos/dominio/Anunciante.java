package com.veiculos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Anunciante extends Usuario{
    private int qtdAnunciosAtivos;
    private int qtsCarrosVendidos;
    private List<Veiculo> veiculosAnunciados = new ArrayList<Veiculo>();

    public Anunciante(String nome, String telefone, String email, int qtdAnunciosAtivos, int qtsCarrosVendidos, List<Veiculo> veiculosAnunciados) {
        super(nome, telefone, email);
        this.qtdAnunciosAtivos = qtdAnunciosAtivos;
        this.qtsCarrosVendidos = qtsCarrosVendidos;
        this.veiculosAnunciados = veiculosAnunciados;
    }

    public Anunciante(String nome, String telefone, String email, int qtdAnunciosAtivos, int qtsCarrosVendidos) {
        super(nome, telefone, email);
        this.qtdAnunciosAtivos = qtdAnunciosAtivos;
        this.qtsCarrosVendidos = qtsCarrosVendidos;
    }

    public int getQtdAnunciosAtivos() {
        return qtdAnunciosAtivos;
    }

    public void setQtdAnunciosAtivos(int qtdAnunciosAtivos) {
        this.qtdAnunciosAtivos = qtdAnunciosAtivos;
    }

    public int getQtsCarrosVendidos() {
        return qtsCarrosVendidos;
    }

    public void setQtsCarrosVendidos(int qtsCarrosVendidos) {
        this.qtsCarrosVendidos = qtsCarrosVendidos;
    }

    public List<Veiculo> getVeiculosAnunciados() {
        return veiculosAnunciados;
    }

    public void setVeiculosAnunciados(List<Veiculo> veiculosAnunciados) {
        this.veiculosAnunciados = veiculosAnunciados;
    }

    public List<Veiculo> listaVeiculosAnunciados() {
        return veiculosAnunciados;
    }

    public void adicionarVeiculoAnunciado (Veiculo veiculo) {
        veiculosAnunciados.add(veiculo);
    }

    public void removerVeiculoAnunciado (Veiculo veiculo) {
        veiculosAnunciados.remove(veiculo);
    }
}
