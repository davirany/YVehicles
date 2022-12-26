package com.veiculos.dominio;

public class Marca {
    private String nome;
    private String nacionalidade;
    private int anoFundacao;

    public Marca(String nome, String nacionalidade, int anoFundacao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}
