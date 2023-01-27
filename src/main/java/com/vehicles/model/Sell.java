package com.vehicles.model;

public class Sell {
    private Advertising advertising;
    private String date;
    private Buyer buyer;
    private int id;

    /**
     * This constructor is responsible for creating a new Sell without the Date or ID parameters because these parameters will be handled by the SellsController
     * @param advertising Advertising object of the Sell
     * @param buyer Buyer object of the Sell
     */
    public Sell(Advertising advertising, Buyer buyer) {
        this.advertising = advertising;
        this.buyer = buyer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Advertising getAdvertising() {
        return advertising;
    }

    public void setAdvertising(Advertising advertising) {
        this.advertising = advertising;
    }
}
