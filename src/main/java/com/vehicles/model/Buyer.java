package com.vehicles.model;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {
    private int amountBoughtVehicles;
    private List<Vehicle> boughtVehicles = new ArrayList<>();

    public Buyer(String name, String phone, String email, int amountBoughtVehicles, List<Vehicle> boughtVehicles) {
        super(name, phone, email);
        this.amountBoughtVehicles = amountBoughtVehicles;
        this.boughtVehicles = boughtVehicles;
    }

    public Buyer(String name, String phone, String email, int amountBoughtVehicles) {
        super(name, phone, email);
        this.amountBoughtVehicles = amountBoughtVehicles;
    }

    public int getAmountBoughtVehicles() {
        return amountBoughtVehicles;
    }

    public void setAmountBoughtVehicles(int amountBoughtVehicles) {
        this.amountBoughtVehicles = amountBoughtVehicles;
    }

    public List<Vehicle> getBoughtVehicles() {
        return boughtVehicles;
    }

    public void setBoughtVehicles(List<Vehicle> boughtVehicles) {
        this.boughtVehicles = boughtVehicles;
    }

    public void addBoughtVehicle(Vehicle vehicle) {
        amountBoughtVehicles++;
        boughtVehicles.add(vehicle);
    }
}
