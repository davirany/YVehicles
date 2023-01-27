package com.vehicles.model;

public class Brand {
    private String name;
    private String nationality;

    /**
     * This constructor is responsible for creating a new Brand
     * @param name Name of the Brand
     * @param nationality Nationality of the Brand
     */
    public Brand(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
