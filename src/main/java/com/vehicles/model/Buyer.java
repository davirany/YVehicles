package com.vehicles.model;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends User {
    private int amountBoughtVehicles;
    /**
     * List that stores all the vehicels that the Buyer bought
     */
    private List<Vehicle> boughtVehicles = new ArrayList<>();

    /**
     * This constructor is responsible for creating a new Buyer
     * @param name Name of the Buyer
     * @param phone Phone number of the Buyer
     * @param email Email of the Buyer
     * @param amountBoughtVehicles Amount of bought vehicles by the Buyer
     * @param boughtVehicles List os Vehicles that the Buyer bought
     */
    public Buyer(String name, String phone, String email, int amountBoughtVehicles, List<Vehicle> boughtVehicles) {
        super(name, phone, email);
        this.amountBoughtVehicles = amountBoughtVehicles;
        this.boughtVehicles = boughtVehicles;
    }

    /**
     * This constructor is responsible for creating a new Buyer without the List of bought vehicles, used to create a Buyer with no bought vehicles, meanwhile the addBoughtVehicle() method will add new vehicles to this List
     * @param name Name of the Buyer
     * @param phone Phone number of the Buyer
     * @param email Email of the Buyer
     * @param amountBoughtVehicles Amount of bought vehicles by the Buyer
     */
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
    /**
     * This method adds a vehicle to the bought vehicles List of the Buyer
     * @param vehicle vehicle that you want to add to the bought vehicles List
     * @author Davi Ranieri Fonseca
     */
    public void addBoughtVehicle(Vehicle vehicle) {
        amountBoughtVehicles++;
        boughtVehicles.add(vehicle);
    }
    /**
     * This method removes a vehicle from the bought vehicles List of the Buyer
     * @param vehicle vehicle that you want to remove from the bought vehicles List
     * @author Davi Ranieri Fonseca
     */
    public void removeBoughtVehicle(Vehicle vehicle) {
        amountBoughtVehicles--;
        boughtVehicles.remove(vehicle);
    }
}
