package com.vehicles.controller;

import com.vehicles.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellsControllerTest {

    SellsController sellsController = new SellsController();

    @Test
    void createSell() {
        Advertiser advertiser = new Advertiser("name", "61912345678", "name@email.com", 0, 0);
        Brand brand = new Brand("Chevrolet", "American", 1911);
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        Advertising advertising = new Advertising(1, "description", advertiser, vehicle);
        Buyer buyer = new Buyer("buyerName", "61912345678", "email@email.com", 23);
        Sell sell = new Sell(advertising, "01/01/2001", buyer, 1);
        sellsController.createSell(sell);
        assertTrue(sellsController.getSells().contains(sell));
    }
}