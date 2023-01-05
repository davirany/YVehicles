package com.vehicles.controller;

import com.vehicles.model.Sell;
import java.util.ArrayList;
import java.util.List;

public class SellsService {
    private final List<Sell> sells = new ArrayList<>();

    public List<Sell> listSells() {
        return sells;
    }

    public void createSell(Sell sell) {
        sells.add(sell);
    }
}
