package com.vehicles.services;

import com.vehicles.domain.Sell;

import java.util.ArrayList;
import java.util.List;

public class SellsManager {
    private final List<Sell> sells = new ArrayList<>();

    public List<Sell> listSells() {return sells;}

    public void createSell(Sell sell) {
        sells.add(sell);
    }
}
