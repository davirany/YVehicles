package com.vehicles.controller;

import com.vehicles.model.Sell;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SellsController {
    /**
     * This attribute is responsible for storage all sells created
     * @author Davi Ranieri Fonseca
     */
    private static final List<Sell> sells = new ArrayList<>();

    public static List<Sell> getSells() {
        return sells;
    }

    /**
     * This method is responsible for create a new sell and adds to the sells List
     * @param sell The desired sell that you want to add in the sells List
     * @author Davi Ranieri Fonseca
     */
    public void createSell(Sell sell) {
        int randomId = (int)(Math.random()*(1500-500+1)+500);
        sell.setId(randomId);

        sell.getBuyer().setAmountBoughtVehicles(sell.getBuyer().getAmountBoughtVehicles() + 1);

        sell.getAdvertising().getAdvertiser().setAmountActiveAds(sell.getAdvertising().getAdvertiser().getAmountActiveAds() - 1);

        sell.getAdvertising().getAdvertiser().setAmountVehiclesSold(sell.getAdvertising().getAdvertiser().getAmountVehiclesSold() + 1);

        sell.setDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        sells.add(sell);
    }

    /**
     * This method is responsible for delete a given sell from sells List
     * @param sell The desired sell that you want to remove from the sells List
     * @author Davi Ranieri Fonseca
     */
    public void removeSell(Sell sell) {
        sell.getBuyer().setAmountBoughtVehicles(sell.getBuyer().getAmountBoughtVehicles() - 1);

        sell.getAdvertising().getAdvertiser().setAmountActiveAds(sell.getAdvertising().getAdvertiser().getAmountActiveAds() + 1);

        sell.getAdvertising().getAdvertiser().setAmountVehiclesSold(sell.getAdvertising().getAdvertiser().getAmountVehiclesSold() - 1);

        sells.remove(sell);
    }
}
