package com.veiculos;

import com.veiculos.dominio.*;
import com.veiculos.servicos.GerenciadorDeAnuncios;
import com.veiculos.servicos.GerenciadorDeVeiculos;
import com.veiculos.servicos.GerenciadorDeVendas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    private final GerenciadorDeVendas gerenciadorDeVendas = new GerenciadorDeVendas();
    private final GerenciadorDeVeiculos gerenciadorDeVeiculos = new GerenciadorDeVeiculos();
    private final GerenciadorDeAnuncios gerenciadorDeAnuncios = new GerenciadorDeAnuncios();

    public static void main(String[] args) {
        Main main = new Main();
        main.executa();
    }

    private void executa() {
        Anunciante anunciante = new Anunciante("Davi", "61-91234-5678", "davi@email", 0);

        Veiculo veiculo = adicionarVeiculo("Chevrolet", "Camaro", "Amarelo", 0, 80000, 2022, 2023);
        gerenciadorDeVeiculos.criarVeiculo(veiculo);
        Anuncio anuncio1 = new Anuncio(1, "Anuncio do carro 1", anunciante, veiculo);
        gerenciadorDeAnuncios.criarAnuncio(anuncio1);

        Veiculo veiculo2 = adicionarVeiculo("Wolksvagen", "Golf", "Branco", 100000, 52000, 2020, 2021);
        gerenciadorDeVeiculos.criarVeiculo(veiculo2);
        Anuncio anuncio2 = new Anuncio(2, "Anuncio do carro 2", anunciante, veiculo2);
        gerenciadorDeAnuncios.criarAnuncio(anuncio2);

        Veiculo veiculo3 = adicionarVeiculo("Ford", "Ka", "Preto", 0, 65000, 2019, 2019);
        gerenciadorDeVeiculos.criarVeiculo(veiculo3);
        Anuncio anuncio3 = new Anuncio(3, "Anuncio do carro 3", anunciante, veiculo3);
        gerenciadorDeAnuncios.criarAnuncio(anuncio3);

        List<Veiculo> veiculos = gerenciadorDeVeiculos.listaVeiculos();
        List<Venda> vendas = gerenciadorDeVendas.listaVendas();
        List<Anuncio> anuncios = gerenciadorDeAnuncios.listaAnuncios();


        System.out.println("\n-----Tres objetos Veiculo foram criados-----");
        listarVeiculos(veiculos);
        System.out.println("\n-----Tres objetos Anuncio foram criados-----");
        listarAnuncios(anuncios);
        System.out.println("\n-----Uma venda foi realizada-----");
        Venda venda = adicionarVenda(anuncio1, "Joao","61-98765-4321", "joao@email.com", 0);
        gerenciadorDeVendas.criarVenda(venda);
        listarVeiculos(veiculos);
        System.out.println("\n-----Essa foi a Venda-----");
        listarVendas(vendas);
        System.out.println("\n-----O objeto Anuncio da venda foi deletado-----");
        listarAnuncios(anuncios);

    }

    private void listarVeiculos(List<Veiculo> veiculos) {
        veiculos.forEach(s -> {
            System.out.println("#"+s.getId() + " --> nomeMarca: " + s.getModelo().getMarca()+" | nomeVeiculo: "+s.getModelo().getNome() + " | cor: " + s.getCor() + " | anoModelo: " + s.getAnoModelo() + " | anoFabricacao: " + s.getAnoFabricacao() + " | preco: " + s.getPreco() + " | quilometragem: " + s.getQuilometragem());
        });
    }

    private void listarVendas(List<Venda> vendas) {
        vendas.forEach(v -> {
            System.out.println("#"+v.getId() + " --> idAnuncio: " + v.getAnuncio().getId() + " | dataVenda: " + v.getData() + " | nomeComprador: " + v.getComprador().getNome()+" | telefoneComprador: "+v.getComprador().getTelefone() + " | emailComprador: " + v.getComprador().getEmail() + " | qtdCarrosComprados: " + v.getComprador().getQtdCarrosComprados());
        });
    }

    private void listarAnuncios(List<Anuncio> anuncios) {
        anuncios.forEach(a -> {
            System.out.println("#"+a.getId() + " --> descricao: " + a.getDescricao() + " | nomeAnunciante: " + a.getAnunciante().getNome() + " | modeloVeiculo: " + a.getVeiculo().getModelo().getNome() + " | idVeiculo: #" + a.getVeiculo().getId());
        });
    }

    private Veiculo adicionarVeiculo(String nomeMarca, String nomeModelo, String cor, int quilometragem, int preco, int anoFabricacao, int anoModelo) {
        Marca marca = criarMarca(nomeMarca, "Nacionalidade", 2022);
        Modelo modelo = criarModelo(nomeModelo, marca);
        int randomVeiculos = (int)(Math.random()*(1500-500+1)+500);
        return new Veiculo(modelo, anoFabricacao, anoModelo, cor, quilometragem, preco, randomVeiculos);
    }

    private Marca criarMarca(String nomeMarca, String nacionalidade, int anoFundacao) {
        return new Marca(nomeMarca, nacionalidade, anoFundacao);
    }

    private Modelo criarModelo( String nomeModelo, Marca marca) {
        return new Modelo(nomeModelo, marca);
    }

    private Venda adicionarVenda(Anuncio anuncio, String nomeComprador, String telefoneComprador, String emailComprador, int qtdCarrosComprados) {
        Comprador comprador = new Comprador(nomeComprador, telefoneComprador, emailComprador, qtdCarrosComprados);
        int randomVenda = (int)(Math.random()*(1000-500+1)+500);
        String dataVenda = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        Veiculo veiculo = anuncio.getVeiculo();
        gerenciadorDeVeiculos.removerVeiculo(veiculo);
        gerenciadorDeAnuncios.removerAnuncio(anuncio);
        int comprados = comprador.getQtdCarrosComprados();
        comprador.setQtdCarrosComprados(comprados+1);
        return new Venda(anuncio, dataVenda, comprador, randomVenda);
    }
}