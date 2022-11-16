package com.example.service;

import com.example.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroService {
    public void createCarro(Carro carro) {
        List<Carro> carros = new ArrayList<>();
        carros.add(carro);
    }
}
