package com.vehicles.model;

import java.util.ArrayList;
import java.util.List;

public class Advertiser extends User {
    private int amountActiveAds;
    private int amountVehiclesSold;
    private List<Vehicle> advertisedVehicle = new ArrayList<>();

    public Advertiser(String name, String phone, String email, int amountActiveAds, int amountVehiclesSold, List<Vehicle> advertisedVehicle) {
        super(name, phone, email);
        this.amountActiveAds = amountActiveAds;
        this.amountVehiclesSold = amountVehiclesSold;
        this.advertisedVehicle = advertisedVehicle;
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

    public List<Vehicle> getAdvertisedVehicle() {
        return advertisedVehicle;
    }

    public void setAdvertisedVehicle(List<Vehicle> advertisedVehicle) {
        this.advertisedVehicle = advertisedVehicle;
    }

    /*TODO Create tests for addAdvertisedCar() and removeAdvertisedCar()*/

    public void addAdvertisedCar(Vehicle vehicle) {
        advertisedVehicle.add(vehicle);
    }

    public void removeAdvertisedVehicle(Vehicle vehicle) {
        advertisedVehicle.remove(vehicle);
    }
}
