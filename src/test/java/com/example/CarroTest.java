package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @InjectMocks
    Carro carro;

    @BeforeEach
    void setUp() {
        carro = new Carro();
        carro.setMarca("Ferrari");
        carro.setModelo("Portofino");
        carro.setAno("20/21");
        carro.setCor("Vermelho");
        carro.setQuilometragem(18000);
    }

    @Test
    void getMarca() {
        String obtido = carro.getMarca();
        assertEquals("Ferrari", obtido);
    }

    @Test
    void setMarca() {
        carro.setMarca("Ferrerrari");
        String obtido = carro.getMarca();
        assertEquals("Ferrerrari", obtido);
    }

    @Test
    void getModelo() {
        String obtido = carro.getModelo();
        assertEquals("Portofino", obtido);
    }

    @Test
    void setModelo() {
        carro.setModelo("Spider V8");
        String obtido = carro.getModelo();
        assertEquals("Spider V8", obtido);
    }

    @Test
    void getAno() {
        String obtido = carro.getAno();
        assertEquals("20/21", obtido);
    }

    @Test
    void setAno() {
        carro.setAno("22/23");
        String obtido = carro.getAno();
        assertEquals("22/23", obtido);
    }

    @Test
    void getCor() {
        String obtido = carro.getCor();
        assertEquals("Vermelho", obtido);
    }

    @Test
    void setCor() {
        carro.setCor("Preto");
        String obtido = carro.getCor();
        assertEquals("Preto", obtido);
    }

    @Test
    void getQuilometragem() {
        int obtido = carro.getQuilometragem();
        assertEquals(18000, obtido);
    }

    @Test
    void setQuilometragem() {
        carro.setQuilometragem(0);
        int obtido = carro.getQuilometragem();
        assertEquals(0, obtido);
    }
}