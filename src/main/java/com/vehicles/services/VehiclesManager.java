package com.vehicles.services;

import com.vehicles.domain.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehiclesManager {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void createVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);}

    public List<Vehicle> listVehicles() {
        return vehicles;
    }

}
