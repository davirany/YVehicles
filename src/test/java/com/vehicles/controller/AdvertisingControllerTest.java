package com.vehicles.controller;

import com.vehicles.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvertisingControllerTest {
    AdvertisingController advertisingController = new AdvertisingController();
    @Test
    void createAdvertising() {
        Advertiser advertiser = new Advertiser("name", "61912345678", "name@email.com", 0, 0);
        Brand brand = new Brand("Chevrolet", "American");
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        Advertising advertising = new Advertising("description", advertiser, vehicle);
        advertisingController.createAdvertising(advertising);
        assertTrue(advertisingController.getAdvertisements().contains(advertising));
    }

    @Test
    void removeAdvertising() {
        Advertiser advertiser = new Advertiser("name", "61912345678", "name@email.com", 0, 0);
        Brand brand = new Brand("Chevrolet", "American");
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        Advertising advertising = new Advertising("description", advertiser, vehicle);
        advertisingController.createAdvertising(advertising);
        advertisingController.removeAdvertising(advertising);
        assertFalse(advertisingController.getAdvertisements().contains(advertising));
    }
}