package com.vehicles.controller;

import com.vehicles.model.Advertising;

import java.util.ArrayList;
import java.util.List;

public class AdvertisingController {
    private final List<Advertising> advertisements = new ArrayList<>();

    public List<Advertising> getAdvertisements() {
        return advertisements;
    }

    public void createAdvertising(Advertising advertising) {
        advertisements.add(advertising);
    }

    public void removeAdvertising(Advertising advertising) {
        advertisements.remove(advertising);
    }
}
