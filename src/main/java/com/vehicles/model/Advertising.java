package com.vehicles.model;

import java.util.Collections;
import java.util.List;

public class Advertising {
    private int id;
    private String description;
    private Advertiser advertiser;
    private Vehicle vehicle;

    public Advertising(int id, String description, Advertiser advertiser, Vehicle vehicle) {
        this.id = id;
        this.description = description;
        this.advertiser = advertiser;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Advertiser getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }
}
