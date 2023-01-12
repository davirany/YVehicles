package com.vehicles.controller;

import com.vehicles.model.Sell;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SellsController {
    private static final List<Sell> sells = new ArrayList<>();

    public static List<Sell> getSells() {
        return sells;
    }

    public void createSell(Sell sell) {
        sell.getBuyer().setAmountBoughtVehicles(sell.getBuyer().getAmountBoughtVehicles() + 1);

        sell.getAdvertising().getAdvertiser().setAmountActiveAds(sell.getAdvertising().getAdvertiser().getAmountActiveAds() - 1);

        sell.getAdvertising().getAdvertiser().setAmountVehiclesSold(sell.getAdvertising().getAdvertiser().getAmountVehiclesSold() + 1);

        sell.setDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        sells.add(sell);
    }

    public void removeSell(Sell sell) {
        sell.getBuyer().setAmountBoughtVehicles(sell.getBuyer().getAmountBoughtVehicles() - 1);

        sell.getAdvertising().getAdvertiser().setAmountActiveAds(sell.getAdvertising().getAdvertiser().getAmountActiveAds() + 1);

        sell.getAdvertising().getAdvertiser().setAmountVehiclesSold(sell.getAdvertising().getAdvertiser().getAmountVehiclesSold() - 1);

        sells.remove(sell);
    }
}
