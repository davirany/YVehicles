package com.vehicles.view.CRUDSell;

import javax.swing.*;

public class Delete extends JPanel {
    public Delete() {
        JLabel idSell = new JLabel("ID_Of_The_Sell");
        JTextField deleteTextField = new JTextField(4);
        JButton deleteButton = new JButton("Delete_sell");
        add(idSell);
        add(deleteTextField);
        add(deleteButton);
    }
}
