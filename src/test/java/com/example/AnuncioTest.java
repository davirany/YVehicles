package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioTest {

    @InjectMocks
    Anuncio anuncio;

    @BeforeEach
    void setUp() {
        anuncio = new Anuncio();
        anuncio.setLoja("ConcessionariaTeste");
        anuncio.setPreco(3200000);
        anuncio.setDonos(1);
        anuncio.setData(LocalDate.ofYearDay(2022, 250));
    }

    @Test
    void getLoja() {
        String obtido = anuncio.getLoja();
        assertEquals("ConcessionariaTeste", obtido);
    }

    @Test
    void getPreco() {
        int obtido = anuncio.getPreco();
        assertEquals(3200000, obtido);
    }

    @Test
    void setLoja() {
        anuncio.setLoja("Saga");
        String obtido = anuncio.getLoja();
        assertEquals("Saga", obtido);
    }

    @Test
    void setPreco() {
        anuncio.setPreco(2800000);
        int obtido = anuncio.getPreco();
        assertEquals(2800000, obtido);
    }
}