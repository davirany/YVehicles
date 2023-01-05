package com.vehicles.controller;

import com.vehicles.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehiclesController {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void createVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> listByPrice(int smallPriceValue, int bigPriceValue) {
        List<Vehicle> newList = new ArrayList<>();
        vehicles.forEach(vehicle -> {
            if (vehicle.getPrice() >= smallPriceValue & vehicle.getPrice() <= bigPriceValue) {
                newList.add(vehicle);
            }
        });
    return newList;
    }

    public List<Vehicle> listByBrand(String brand) {
        List<Vehicle> newList = new ArrayList<>();
        vehicles.forEach(vehicle -> {
            if (Objects.equals(vehicle.getModel().getBrand(), brand)) {
                newList.add(vehicle);
            }
        });
        return newList;
    }

}
