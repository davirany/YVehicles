package com.vehicles.view.CRUDVehicles;

import javax.swing.*;

public class Delete extends JPanel{
    /*TODO implements functionalities to this screen*/
    public Delete() {
        JLabel idVehicles = new JLabel("ID Of The Vehicle");
        JTextField deleteTextField = new JTextField(4);
        JButton deleteButton = new JButton("Delete_Vehicle");
        add(idVehicles);
        add(deleteTextField);
        add(deleteButton);
    }
}
