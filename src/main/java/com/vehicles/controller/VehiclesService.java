package com.vehicles.controller;

import com.vehicles.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehiclesService {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void createVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> listVehicles() {
        return vehicles;
    }

    public void listByPrice(int smallPriceValue, int bigPriceValue) {
        vehicles.forEach(vehicle -> {
            if (vehicle.getPrice() >= smallPriceValue & vehicle.getPrice() <= bigPriceValue) {
                System.out.println("#" + vehicle.getId() + " | vehicleName: " + vehicle.getModel().getName() + " | vehicleBrand: " + vehicle.getModel().getBrand());
            }
        });
    }

    public void listByBrand(String brand) {
        vehicles.forEach(vehicle -> {
            if (Objects.equals(vehicle.getModel().getBrand(), brand)) {
                System.out.println("#"+vehicle.getId() + " --> brandName: " + vehicle.getModel().getBrand()+" | vehicleName: "+vehicle.getModel().getName() + " | color: " + vehicle.getColor() + " | modelYear: " + vehicle.getModelYear() + " | manufactureYear: " + vehicle.getManufactureYear() + " | price: " + vehicle.getPrice() + " | mileage: " + vehicle.getMileage());
            }
        });
    }

}
