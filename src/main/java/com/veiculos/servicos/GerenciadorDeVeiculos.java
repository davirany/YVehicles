package com.veiculos.servicos;

import com.veiculos.dominio.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeVeiculos {
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public void criarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(Veiculo veiculo) {veiculos.remove(veiculo);}

    public List<Veiculo> listaVeiculos() {
        return veiculos;
    }

}
