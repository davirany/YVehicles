package com.vehicles.view.CRUDUsers;

import javax.swing.*;

public class Update extends JPanel {
    public Update() {
        JTabbedPane updateUser = new JTabbedPane();
        add(updateUser);

        AdvertiserUpdate advertiserUpdate = new AdvertiserUpdate();
        BuyerUpdate buyerUpdate = new BuyerUpdate();

        updateUser.addTab("Advertiser", advertiserUpdate);
        updateUser.addTab("Buyer", buyerUpdate);
    }
}
