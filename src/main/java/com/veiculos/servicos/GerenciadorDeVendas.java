package com.veiculos.servicos;

import com.veiculos.dominio.Veiculo;
import com.veiculos.dominio.Venda;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeVendas {
    private List<Venda> vendas = new ArrayList<Venda>();
    public List<Venda> listaVendas() {return vendas;}

    public void criarVenda(Venda venda) {
        vendas.add(venda);
    }
}
