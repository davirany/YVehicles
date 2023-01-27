package com.vehicles.model;

public abstract class User {
    private String name;
    private String phone;
    private String email;

    /**
     * This constructor is used as parent by the Buyer and Advertiser classes
     * @param name Name of the User
     * @param phone Phone number of the User
     * @param email Email of the User
     */
    public User(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
