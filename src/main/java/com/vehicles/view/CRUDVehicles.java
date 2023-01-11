package com.vehicles.view;

import javax.swing.*;

public class CRUDVehicles extends JPanel {
    /*TODO Create this component*/
    public CRUDVehicles() {
        setSize(550, 500);
        JLabel label = new JLabel();
        label.setText("Vehicles");
        JTextField vehiclesTextField = new JTextField(16);
        add(label);
        add(vehiclesTextField);
    }
}
