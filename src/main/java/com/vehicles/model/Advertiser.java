package com.vehicles.model;

import java.util.ArrayList;
import java.util.List;

public class Advertiser extends User {
    private int amountActiveAds;
    private int amountVehiclesSold;
    private List<Vehicle> advertisedVehicles = new ArrayList<>();

    public Advertiser(String name, String phone, String email, int amountActiveAds, int amountVehiclesSold, List<Vehicle> advertisedVehicles) {
        super(name, phone, email);
        this.amountActiveAds = amountActiveAds;
        this.amountVehiclesSold = amountVehiclesSold;
        this.advertisedVehicles = advertisedVehicles;
    }

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

    /*TODO Create tests for addAdvertisedCar() and removeAdvertisedCar()*/

    public void addAdvertisedCar(Vehicle vehicle) {
        amountActiveAds++;
        advertisedVehicles.add(vehicle);
    }

    public void removeAdvertisedVehicle(Vehicle vehicle) {
        amountActiveAds--;
        advertisedVehicles.remove(vehicle);
    }
}
