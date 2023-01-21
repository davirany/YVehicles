package com.vehicles.controller;

import com.vehicles.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehiclesController {
    private static List<Vehicle> vehicles = new ArrayList<>();

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void createVehicle(Vehicle vehicle) {
        int randomId = (int)(Math.random()*(1500-500+1)+500);
        vehicle.setId(randomId);
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
