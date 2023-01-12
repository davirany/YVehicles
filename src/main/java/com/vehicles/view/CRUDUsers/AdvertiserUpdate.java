package com.vehicles.view.CRUDUsers;

import javax.swing.*;
import java.awt.*;

public class AdvertiserUpdate extends JPanel {
    public AdvertiserUpdate() {
        setLayout(new GridLayout(4,2));
        JLabel emailLabel = new JLabel("Email_Of_The_User");
        add(emailLabel);
        JTextField emailTextField = new JTextField(12);
        add(emailTextField);

        JLabel nameLabel = new JLabel("Name");
        add(nameLabel);
        JTextField nameTextField = new JTextField(12);
        add(nameTextField);

        JLabel phoneLabel = new JLabel("Phone");
        add(phoneLabel);
        JTextField phoneTextField = new JTextField(12);
        add(phoneTextField);

        JButton updateUser = new JButton("Update_User");
        add(updateUser);
    }
}
