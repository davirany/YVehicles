package com.vehicles.controller;

import com.vehicles.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VehiclesController {
    /**
     * This attribute is responsible for storage all vehicles created
     * @author Davi Ranieri Fonseca
     */
    private static List<Vehicle> vehicles = new ArrayList<>();

    public static List<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * This method is responsible for creating an id for the vehicle and adding the desired vehicle in the vehicles List
     * @param vehicle The vehicles that you want to add in the vehicles List
     * @author Davi Ranieri Fonseca
     */
    public void createVehicle(Vehicle vehicle) {
        int randomId = (int)(Math.random()*(1500-500+1)+500);
        vehicle.setId(randomId);
        vehicles.add(vehicle);
    }
    /**
     * This method is responsible for delete a given vehicle from vehicles List
     * @param vehicle The vehicles that you want to remove from the vehicles List
     * @author Davi Ranieri Fonseca
     */
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    /**
     * This method is responsible for generate a List of vehicles whose price is within the delimited range
     * @param smallPriceValue Determines the smallest value of the desired range
     * @param bigPriceValue Determines the largest value of the desired range
     * @return List of vehicles in the determined range
     */

    public List<Vehicle> listByPrice(int smallPriceValue, int bigPriceValue) {
        List<Vehicle> newList = new ArrayList<>();
        vehicles.forEach(vehicle -> {
            if (vehicle.getPrice() >= smallPriceValue & vehicle.getPrice() <= bigPriceValue) {
                newList.add(vehicle);
            }
        });
    return newList;
    }

    /**
     * This method is responsible for generate a List of vehicles whose brand matches the desired one
     * @param brand Brand that you are looking for in the vehicles List
     * @return List of vehicles of that determined brand
     */
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
