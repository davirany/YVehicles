package com.vehicles.model;

public class Sell {
    private Advertising advertising;
    private String date;
    private Buyer buyer;
    private int id;

    public Sell(Advertising advertising, Buyer buyer) {
        this.advertising = advertising;
        this.date = date;
        this.buyer = buyer;
        this.id = id;
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
