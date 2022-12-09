package com.example;

public class Anunciante extends Usuario{
    private int qtdAnunciosAtivos;
    private int qtdAnunciosInativos;

    public int getQtdAnunciosAtivos() {
        return qtdAnunciosAtivos;
    }

    public void setQtdAnunciosAtivos(int qtdAnunciosAtivos) {
        this.qtdAnunciosAtivos = qtdAnunciosAtivos;
    }

    public int getQtdAnunciosInativos() {
        return qtdAnunciosInativos;
    }

    public void setQtdAnunciosInativos(int qtdAnunciosInativos) {
        this.qtdAnunciosInativos = qtdAnunciosInativos;
    }
}
