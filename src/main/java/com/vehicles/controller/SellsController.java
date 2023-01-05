package com.vehicles.controller;

import com.vehicles.model.Sell;
import java.util.ArrayList;
import java.util.List;

public class SellsController {
    private final List<Sell> sells = new ArrayList<>();

    public List<Sell> getSells() {
        return sells;
    }

    public void createSell(Sell sell) {
        sells.add(sell);
    }
}
