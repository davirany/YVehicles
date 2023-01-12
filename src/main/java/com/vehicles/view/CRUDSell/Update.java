package com.vehicles.view.CRUDSell;

import javax.swing.*;
import java.awt.*;

public class Update extends JPanel{
    /*private Advertising advertising;
    private String date;
    private Buyer buyer;
    private int id;*/
    public Update() {
        setLayout(new GridLayout(7,2));
        JLabel idLabel = new JLabel("ID_Of_The_Sell");
        add(idLabel);
        JTextField idTextField = new JTextField(3);
        add(idTextField);

        JLabel dateOfSellLabel = new JLabel("Date_Of_The_Sell");
        add(dateOfSellLabel);
        JTextField dateOfSellTextField = new JTextField(12);
        add(dateOfSellTextField);

        JLabel idOfBuyerLabel = new JLabel("ID_Of_The_Buyer");
        add(idOfBuyerLabel);
        JTextField idOfBuyerTextField = new JTextField(12);
        add(idOfBuyerTextField);

        JButton updateSell = new JButton("Update_Sell");
        add(updateSell);
    }
}
