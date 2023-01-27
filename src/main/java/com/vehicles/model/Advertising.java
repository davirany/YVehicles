package com.vehicles.model;

public class Advertising {
    private int id;
    private String description;
    private Advertiser advertiser;
    private Vehicle vehicle;

    /**
     * This constructor is responsible for creating a new Advertising without th ID and Description parameters because this two are handled by other methods
     * @param advertiser Advertiser object responsible for this Advertising
     * @param vehicle Vehicle object of the Advertising
     */
    public Advertising(Advertiser advertiser, Vehicle vehicle) {
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
