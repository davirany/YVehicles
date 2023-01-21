package com.vehicles.controller;

import com.vehicles.model.Brand;
import com.vehicles.model.Model;
import com.vehicles.model.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesControllerTest {
    VehiclesController vehiclesController = new VehiclesController();
    @Test
    void createVehicle() {
        Brand brand = new Brand("Chevrolet", "American");
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        vehiclesController.createVehicle(vehicle);
        assertTrue(vehiclesController.getVehicles().contains(vehicle));
    }

    @Test
    void removeVehicle() {
        Brand brand = new Brand("Chevrolet", "American");
        Model model = new Model("Camaro", brand);
        Vehicle vehicle = new Vehicle(model, 2022, 2023, "Yellow", 0, 550000, 1);
        vehiclesController.createVehicle(vehicle);
        vehiclesController.removeVehicle(vehicle);
        assertFalse(vehiclesController.getVehicles().contains(vehicle));
    }

    @Test
    void listByPrice() {
        Brand brand1 = new Brand("Chevrolet", "American");
        Model model1 = new Model("Camaro", brand1);
        Vehicle vehicle1 = new Vehicle(model1, 2022, 2023, "Yellow", 0, 550000, 1);
        vehiclesController.createVehicle(vehicle1);

        Brand brand2 = new Brand("Chevrolet", "American");
        Model model2 = new Model("Camaro", brand2);
        Vehicle vehicle2 = new Vehicle(model2, 1999, 2000, "White", 152242, 20360, 2);
        vehiclesController.createVehicle(vehicle2);

        Brand brand3 = new Brand("Chevrolet", "American");
        Model model3 = new Model("Camaro", brand3);
        Vehicle vehicle3 = new Vehicle(model3, 2011, 2011, "Silver", 106960, 69513, 3);
        vehiclesController.createVehicle(vehicle3);

        assertTrue(vehiclesController.listByPrice(500000,600000).contains(vehicle1));
        assertFalse(vehiclesController.listByPrice(500000,600000).contains(vehicle2));
        assertFalse(vehiclesController.listByPrice(500000,600000).contains(vehicle3));
    }

    @Test
    void listByBrand() {
        Brand brand1 = new Brand("Chevrolet", "American");
        Model model1 = new Model("Camaro", brand1);
        Vehicle vehicle1 = new Vehicle(model1, 2022, 2023, "Yellow", 0, 550000, 1);
        vehiclesController.createVehicle(vehicle1);

        Brand brand2 = new Brand("Volkswagen", "German");
        Model model2 = new Model("Nivus", brand2);
        Vehicle vehicle2 = new Vehicle(model2, 2022, 2022, "Blue", 0, 143990, 2);
        vehiclesController.createVehicle(vehicle2);

        Brand brand3 = new Brand("Toyota", "Japanese");
        Model model3 = new Model("Corolla Cross", brand3);
        Vehicle vehicle3 = new Vehicle(model3, 2022, 2023, "Silver", 0, 226900, 3);
        vehiclesController.createVehicle(vehicle3);

        assertTrue(vehiclesController.listByBrand("Toyota").contains(vehicle3));
        assertFalse(vehiclesController.listByBrand("Toyota").contains(vehicle1));
        assertFalse(vehiclesController.listByBrand("Toyota").contains(vehicle2));
    }
}