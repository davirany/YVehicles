package com.vehicles.view.CRUDUsers;

import javax.swing.*;

public class Delete extends JPanel {
    public Delete() {
        JTabbedPane deleteUser = new JTabbedPane();
        add(deleteUser);

        AdvertiserDelete advertiserDelete = new AdvertiserDelete();
        BuyerDelete buyerDelete = new BuyerDelete();

        deleteUser.addTab("Advertiser", advertiserDelete);
        deleteUser.addTab("Buyer", buyerDelete);
    }
}
