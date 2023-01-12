package com.vehicles.view.CRUDUsers;

import javax.swing.*;
import java.awt.*;

public class BuyerCreate extends JPanel {
    /*TODO implements functionalities to this screen*/
    public BuyerCreate() {
        setLayout(new GridLayout(5,2));
        JLabel nameLabel = new JLabel("Name");
        add(nameLabel);
        JTextField nameTextField = new JTextField(12);
        add(nameTextField);

        JLabel phoneLabel = new JLabel("Phone");
        add(phoneLabel);
        JTextField phoneTextField = new JTextField(12);
        add(phoneTextField);

        JLabel emailLabel = new JLabel("Email");
        add(emailLabel);
        JTextField emailTextField = new JTextField(12);
        add(emailTextField);

        JLabel vehiclesBoughtLabel = new JLabel("Vehicles_Bought");
        add(vehiclesBoughtLabel);
        JTextField vehiclesBoughtTextField = new JTextField(12);
        add(vehiclesBoughtTextField);

        JButton createUser = new JButton("Create_User");
        add(createUser);
    }
}
