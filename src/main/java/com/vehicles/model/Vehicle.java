package com.vehicles.model;

public class Vehicle {
    private Model model;
    private int manufactureYear;
    private int modelYear;
    private String color;
    private int mileage;
    private int price;
    private int id;

    /**
     * This constructor is responsible for create a new Vehicle
     * @param model Model object of the Vehicle
     * @param manufactureYear Year of manufacture of the Vehicle
     * @param modelYear Year of the model of the Vehicle
     * @param color Color name of the Vehicle
     * @param mileage Mileage of the Vehicle
     * @param price Price of the Vehicle
     * @param id ID of the Vehicle
     */
    public Vehicle(Model model, int manufactureYear, int modelYear, String color, int mileage, int price, int id) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.modelYear = modelYear;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
        this.id = id;
    }

    /**
     * This constructor is responsible for create a new Vehicle without the ID parameter, because is handled by the VehiclesController
     * @param model Model object of the Vehicle
     * @param manufactureYear Year of manufacture of the Vehicle
     * @param modelYear Year of the model of the Vehicle
     * @param color Color name of the Vehicle
     * @param mileage Mileage of the Vehicle
     * @param price Price of the Vehicle
     */
    public Vehicle(Model model, int manufactureYear, int modelYear, String color, int mileage, int price) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.modelYear = modelYear;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
