package com.veiculos.servicos;

import com.veiculos.dominio.Anuncio;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAnuncios {
    private List<Anuncio> anuncios = new ArrayList<Anuncio>();

    public void criarAnuncio(Anuncio anuncio) {
        anuncios.add(anuncio);
    }

    public void removerAnuncio(Anuncio anuncio) {anuncios.remove(anuncio);}

    public List<Anuncio> listaAnuncios() {
        return anuncios;
    }
}
