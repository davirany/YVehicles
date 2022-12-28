package com.vehicles.domain;

public class Brand {
    private String name;
    private String nationality;
    private int foundedIn;

    public Brand(String name, String nationality, int foundedIn) {
        this.name = name;
        this.nationality = nationality;
        this.foundedIn = foundedIn;
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

    public int getFoundedIn() {
        return foundedIn;
    }

    public void setFoundedIn(int foundedIn) {
        this.foundedIn = foundedIn;
    }
}
