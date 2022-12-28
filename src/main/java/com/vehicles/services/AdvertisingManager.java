package com.vehicles.services;

import com.vehicles.domain.Advertising;

import java.util.ArrayList;
import java.util.List;

public class AdvertisingManager {
    private final List<Advertising> advertisements = new ArrayList<>();

    public void createAdvertising(Advertising advertising) {
        advertisements.add(advertising);
    }

    public void removeAdvertising(Advertising advertising) {
        advertisements.remove(advertising);}

    public List<Advertising> listAdvertisements() {
        return advertisements;
    }
}
