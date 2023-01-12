package com.vehicles.view.CRUDSell;

import javax.swing.*;

public class CRUDSell extends JPanel{
    /*TODO Create this component*/
    public CRUDSell(){
        setSize(550, 500);
        JLabel label = new JLabel();
        label.setText("Sells");
        JTextField sellsTextField = new JTextField(16);
        add(label);
        add(sellsTextField);
    }
}
