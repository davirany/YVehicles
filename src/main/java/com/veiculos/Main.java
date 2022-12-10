package com.veiculos;

import com.veiculos.dominio.*;
import com.veiculos.servicos.GerenciadorDeVeiculos;
import com.veiculos.servicos.GerenciadorDeVendas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    int min = 1;
    int max = 500;
    private GerenciadorDeVendas gerenciadorDeVendas = new GerenciadorDeVendas();
    private GerenciadorDeVeiculos gerenciadorDeVeiculos = new GerenciadorDeVeiculos();

    public static void main(String[] args) {
        Main main = new Main();
        main.executa();
    }

    private void executa() {
        Veiculo veiculo = adicionarVeiculo("Chevrolet", "Camaro", "Amarelo", 0, 80000, 2022, 2023);
        gerenciadorDeVeiculos.criarVeiculo(veiculo);

        Veiculo veiculo2 = adicionarVeiculo("Wolksvagen", "Golf", "Branco", 100000, 52000, 2020, 2021);
        gerenciadorDeVeiculos.criarVeiculo(veiculo2);

        Veiculo veiculo3 = adicionarVeiculo("Ford", "Ka", "Preto", 0, 65000, 2019, 2019);
        gerenciadorDeVeiculos.criarVeiculo(veiculo3);

        List<Veiculo> veiculos = gerenciadorDeVeiculos.listarVeiculos();
        List<Venda> vendas = gerenciadorDeVendas.listarVendas();


        System.out.println("\n-----Tres objetos Veiculo foram criados-----");
        listarVeiculos(veiculos);
        System.out.println("\n-----Uma venda foi realizada-----");

        Venda venda = adicionarVenda(veiculo, "Joao","Davi", "555-0981-5000","555-1029-3342", "joao@email.com", "davi@email.com");
        gerenciadorDeVendas.criarVenda(venda);
        gerenciadorDeVeiculos.removerVeiculo(veiculo);
        listarVeiculos(veiculos);
        System.out.println("\n-----Essa foi a Venda-----");
        listarVendas(vendas);
    }

    private void listarVeiculos(List<Veiculo> veiculos) {
        veiculos.forEach(s -> {
            System.out.println("nomeMarca: " + s.getModelo().getMarca()+" | nomeVeiculo: "+s.getModelo().getNome()+" #"+s.getId());
        });
    }

    private void listarVendas(List<Venda> vendas) {
        vendas.forEach(v -> {
            System.out.println("nomeMarca: " + v.getVeiculo().getModelo().getMarca() + " | nomeCarro: " + v.getVeiculo().getModelo().getNome() + " | dataVenda: " + v.getData() + " | nomeComprador: " + v.getComprador()+" | nomeAnunciante: "+v.getAnunciante()+" #"+v.getId());
        });
    }

    private Veiculo adicionarVeiculo(String nomeMarca, String nomeModelo, String cor, int quilometragem, int preco, int anoFabricacao, int anoModelo) {
        Modelo modelo = criarModelo(nomeModelo, nomeMarca);
        int id = (int)(Math.random()*(max-min+1)+min);
        return new Veiculo(modelo, anoFabricacao, anoModelo, cor, quilometragem, preco, id);
    }

    private Modelo criarModelo( String nomeModelo, String nomeMarca) {
        Marca marca = new Marca(nomeMarca);
        return new Modelo(nomeModelo, marca);
    }

    private Venda adicionarVenda(Veiculo veiculo, String nomeComprador, String nomeAnunciante, String telefoneComprador, String telefoneAnunciante, String emailComprador, String emailAnunciante) {
        Comprador comprador = new Comprador(nomeComprador, telefoneComprador, emailComprador);
        Anunciante anunciante = new Anunciante(nomeAnunciante, telefoneAnunciante, emailAnunciante);
        int id = (int)(Math.random()*((max+500)-(min+499)+min));
        String dataVenda = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        return new Venda(veiculo, dataVenda, anunciante, comprador, id);
    }


}