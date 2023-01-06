package com.vehicles.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvertiserTest {
    Advertiser advertiser = new Advertiser("name", "61912345678", "name@email.com", 0, 0);
    Brand brand = new Brand("Chevrolet", "American", 1911);
    Model model = new Model("Camaro", brand);
    Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);

    @Test
    void addAdvertisedCar() {
        advertiser.addAdvertisedCar(vehicle);
        assertTrue(advertiser.getAdvertisedVehicles().contains(vehicle));
        assertTrue(advertiser.getAmountActiveAds() > 0);
    }

    @Test
    void removeAdvertisedVehicle() {
        advertiser.addAdvertisedCar(vehicle);
        advertiser.removeAdvertisedVehicle(vehicle);
        assertFalse(advertiser.getAdvertisedVehicles().contains(vehicle));
        assertEquals(0, advertiser.getAmountActiveAds());
    }
}