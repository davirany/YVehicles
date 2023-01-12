package com.vehicles.view.Consult;

import javax.swing.*;

public class Consult extends JPanel{
    /*TODO Create this component*/
    public Consult(){
        setSize(550, 500);
        JLabel label = new JLabel();
        JTextField jTextFieldCargo = new JTextField(16);
        label.setText("Consults");
        add(label);
        add(jTextFieldCargo);
    }
}
