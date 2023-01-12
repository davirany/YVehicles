package com.vehicles.view.CRUDUsers;

import javax.swing.*;
import java.awt.*;

public class AdvertiserCreate extends JPanel {
    /*TODO implements functionalities to this screen*/
    public AdvertiserCreate() {
        setLayout(new GridLayout(6,2));
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

        JLabel adsActiveLabel = new JLabel("ActiveAds");
        add(adsActiveLabel);
        JTextField adsActiveTextField = new JTextField(12);
        add(adsActiveTextField);

        JLabel vehiclesSoldLabel = new JLabel("Vehicles_Sold");
        add(vehiclesSoldLabel);
        JTextField vehiclesSoldTextField = new JTextField(12);
        add(vehiclesSoldTextField);

        JButton createUser = new JButton("Create_User");
        add(createUser);
    }
}
