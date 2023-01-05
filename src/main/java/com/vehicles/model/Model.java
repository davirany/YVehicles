package com.vehicles.model;

public class Model {
    private String name;
    private Brand brand;

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
