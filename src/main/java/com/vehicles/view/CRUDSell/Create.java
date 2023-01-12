package com.vehicles.view.CRUDSell;

import javax.swing.*;
import java.awt.*;

public class Create extends JPanel {
    public Create() {
        setLayout(new GridLayout(3,2));
        JLabel advertisingIdLabel = new JLabel("Advertising_ID");
        add(advertisingIdLabel);
        JTextField advertisingIdTextField = new JTextField(12);
        add(advertisingIdTextField);

        JLabel buyerIdLabel = new JLabel("Buyer_ID");
        add(buyerIdLabel);
        JTextField buyerIdTextField = new JTextField(12);
        add(buyerIdTextField);

        JButton createButton = new JButton("Create_Sell");
        add(createButton);
    }
}
