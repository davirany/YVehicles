package com.vehicles.controller;

import com.vehicles.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SellsControllerTest {

    SellsController sellsController = new SellsController();

    @Test
    void createSell() {
        Advertiser advertiser = new Advertiser("name", "61912345678", "name@email.com", 1, 0);
        Brand brand = new Brand("Chevrolet", "American");
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        Advertising advertising = new Advertising(advertiser, vehicle);
        Buyer buyer = new Buyer("buyerName", "61912345678", "email@email.com", 0);
        Sell sell = new Sell(advertising, buyer);
        sellsController.createSell(sell);

        assertTrue(sellsController.getSells().contains(sell));
        assertTrue(sell.getBuyer().getAmountBoughtVehicles() > 0);
        assertTrue(sell.getAdvertising().getAdvertiser().getAmountActiveAds() < 1);
        assertTrue(sell.getAdvertising().getAdvertiser().getAmountVehiclesSold() > 0);
    }

    @Test
    void removeSell() {
        Advertiser advertiser = new Advertiser("name", "61912345678", "name@email.com", 1, 0);
        Brand brand = new Brand("Chevrolet", "American");
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        Advertising advertising = new Advertising(advertiser, vehicle);
        Buyer buyer = new Buyer("buyerName", "61912345678", "email@email.com", 0);
        Sell sell = new Sell(advertising, buyer);
        sellsController.createSell(sell);
        sellsController.removeSell(sell);

        assertFalse(sellsController.getSells().contains(sell));
        assertEquals(0, sell.getBuyer().getAmountBoughtVehicles());
        assertEquals(1, sell.getAdvertising().getAdvertiser().getAmountActiveAds());
        assertEquals(0, sell.getAdvertising().getAdvertiser().getAmountVehiclesSold());
    }
}