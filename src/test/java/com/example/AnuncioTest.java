package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioTest {

    @InjectMocks
    Anuncio anuncio;

    @BeforeEach
    void setUp() {
        anuncio = new Anuncio();
        anuncio.setAno("21/22");
        anuncio.setCambio("Manual");
        anuncio.setCor("Vermelho");
        anuncio.setLoja("ConcessionariaTeste");
        anuncio.setMarca("Ferrari");
        anuncio.setModelo("Portofino");
        anuncio.setPreco(3200000);
        anuncio.setQuilometragem(18200);
    }
    @Test
    void getAno(){
        String obtido = anuncio.getAno();
        assertEquals("21/22",obtido);
    }

    @Test
    void getCambio() {
        String obtido = anuncio.getCambio();
        assertEquals("Manual", obtido);
    }

    @Test
    void getCor() {
        String obtido = anuncio.getCor();
        assertEquals("Vermelho", obtido);
    }

    @Test
    void getLoja() {
        String obtido = anuncio.getLoja();
        assertEquals("ConcessionariaTeste", obtido);
    }

    @Test
    void getMarca() {
        String obtido = anuncio.getMarca();
        assertEquals("Ferrari", obtido);
    }

    @Test
    void getModelo() {
        String obtido = anuncio.getModelo();
        assertEquals("Portofino", obtido);
    }

    @Test
    void getPreco() {
        int obtido = anuncio.getPreco();
        assertEquals(3200000, obtido);
    }

    @Test
    void getQuilometragem() {
        int obtido = anuncio.getQuilometragem();
        assertEquals(18200, obtido);
    }

    @Test
    void setAno() {
        anuncio.setAno("20/21");
        String obtido = anuncio.getAno();
        assertEquals("20/21", obtido);
    }

    @Test
    void setCambio() {
        anuncio.setCambio("Automatico");
        String obtido = anuncio.getCambio();
        assertEquals("Automatico", obtido);
    }

    @Test
    void setCor() {
        anuncio.setCor("Preto");
        String obtido = anuncio.getCor();
        assertEquals("Preto", obtido);
    }

    @Test
    void setLoja() {
        anuncio.setLoja("Saga");
        String obtido = anuncio.getLoja();
        assertEquals("Saga", obtido);
    }

    @Test
    void setMarca() {
        anuncio.setMarca("Ferrerrari");
        String obtido = anuncio.getMarca();
        assertEquals("Ferrerrari", obtido);
    }

    @Test
    void setModelo() {
        anuncio.setModelo("Spider V8");
        String obtido = anuncio.getModelo();
        assertEquals("Spider V8", obtido);
    }

    @Test
    void setPreco() {
        anuncio.setPreco(2800000);
        int obtido = anuncio.getPreco();
        assertEquals(2800000, obtido);
    }

    @Test
    void setQuilometragem() {
        anuncio.setQuilometragem(0);
        int obtido = anuncio.getQuilometragem();
        assertEquals(0, obtido);
    }
}