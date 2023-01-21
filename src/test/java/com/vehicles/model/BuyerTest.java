package com.vehicles.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyerTest {
    List<Vehicle> boughtVehicles = new ArrayList<>();
    Buyer buyer = new Buyer("buyerName", "61912345678", "buyer@email.com", 0, boughtVehicles);
    Brand brand = new Brand("Chevrolet", "American");
    Model model = new Model("Camaro", brand);
    Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);

    @Test
    void addBoughtVehicle() {
        buyer.addBoughtVehicle(vehicle);
        assertTrue(buyer.getBoughtVehicles().contains(vehicle));
        assertTrue(buyer.getAmountBoughtVehicles() > 0);
    }


    @Test
    void removeBoughtVehicle() {
        buyer.addBoughtVehicle(vehicle);
        buyer.removeBoughtVehicle(vehicle);
        assertFalse(buyer.getBoughtVehicles().contains(vehicle));
        assertEquals(0, buyer.getAmountBoughtVehicles());
    }
}