package com.vehicles.model;

import java.util.ArrayList;
import java.util.List;

public class Advertiser extends User {
    private int amountActiveAds;
    private int amountVehiclesSold;
    /**
     * List that stores all the vehicles that the Advertised has advertised
     */
    private List<Vehicle> advertisedVehicles = new ArrayList<>();

    public Advertiser(String name, String phone, String email, int amountActiveAds, int amountVehiclesSold) {
        super(name, phone, email);
        this.amountActiveAds = amountActiveAds;
        this.amountVehiclesSold = amountVehiclesSold;
    }

    public int getAmountActiveAds() {
        return amountActiveAds;
    }

    public void setAmountActiveAds(int amountActiveAds) {
        this.amountActiveAds = amountActiveAds;
    }

    public int getAmountVehiclesSold() {
        return amountVehiclesSold;
    }

    public void setAmountVehiclesSold(int amountVehiclesSold) {
        this.amountVehiclesSold = amountVehiclesSold;
    }

    public List<Vehicle> getAdvertisedVehicles() {
        return advertisedVehicles;
    }

    public void setAdvertisedVehicles(List<Vehicle> advertisedVehicles) {
        this.advertisedVehicles = advertisedVehicles;
    }

    /**
     * This method adds a new vehicle in the advertised vehicles List of the Advertiser
     * @param vehicle vehicle that you want to add in the advertised vehicles List
     * @author Davi Ranieri Fonseca
     */
    public void addAdvertisedCar(Vehicle vehicle) {
        amountActiveAds++;
        advertisedVehicles.add(vehicle);
    }

    /**
     * This method removes a vehicle from the advertised vehicles List of the Advertiser
     * @param vehicle vehicle that you want to remove from the advertised vehicles List
     * @author Davi Ranieri Fonseca
     */
    public void removeAdvertisedVehicle(Vehicle vehicle) {
        amountActiveAds--;
        advertisedVehicles.remove(vehicle);
    }
}
