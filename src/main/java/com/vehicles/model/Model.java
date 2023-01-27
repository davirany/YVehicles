package com.vehicles.model;

public class Model {
    private String name;
    private Brand brand;

    /**
     * This constructor is responsible for creating a new
     * @param name Name of the model of the vehicle
     * @param brand Brand object of the vehicle
     */
    public Model(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand.getName();
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
