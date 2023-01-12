package com.vehicles.view.CRUDUsers;

import javax.swing.*;

public class Create extends JPanel {
    public Create(){

        JTabbedPane createUser = new JTabbedPane();
        add(createUser);

        AdvertiserCreate advertiserCreate = new AdvertiserCreate();
        BuyerCreate buyerCreate = new BuyerCreate();

        createUser.addTab("Advertiser", advertiserCreate);
        createUser.addTab("Buyer", buyerCreate);
    }
}
