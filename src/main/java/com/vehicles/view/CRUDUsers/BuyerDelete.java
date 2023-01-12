package com.vehicles.view.CRUDUsers;

import javax.swing.*;

public class BuyerDelete extends JPanel {
    public BuyerDelete() {
        JLabel emailLabel = new JLabel("Email_Of_The_User");
        add(emailLabel);
        JTextField emailTextField = new JTextField(12);
        add(emailTextField);

        JButton deleteUser = new JButton("Delete_User");
        add(deleteUser);
    }
}
