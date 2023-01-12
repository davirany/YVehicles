package com.vehicles.view.CRUDVehicles;

import javax.swing.*;
import java.awt.*;

public class Create extends JPanel {
    /*TODO implements functionalities to this screen*/
    public Create(){
        setLayout(new GridLayout(4,4,0,5));
        JLabel brandLabel = new JLabel("Brand");
        add(brandLabel);
        JTextField brandTextField = new JTextField(12);
        add(brandTextField);

        JLabel modelLabel = new JLabel("Model");
        add(modelLabel);
        JTextField modelTextField = new JTextField(12);
        add(modelTextField);

        JLabel colorLabel = new JLabel("Color");
        add(colorLabel);
        JTextField colorTextField = new JTextField(12);
        add(colorTextField);

        JLabel mileageLabel = new JLabel("Mileage");
        add(mileageLabel);
        JTextField mileageTextField = new JTextField(12);
        add(mileageTextField);

        JLabel manuYearLabel = new JLabel("Manufacture_Year");
        add(manuYearLabel);
        JTextField manuYearTextField = new JTextField(4);
        add(manuYearTextField);

        JLabel modelYearLabel = new JLabel("Model_Year");
        add(modelYearLabel);
        JTextField modelYearTextField = new JTextField(4);
        add(modelYearTextField);

        JLabel priceLabel = new JLabel("Price");
        add(priceLabel);
        JTextField priceTextField = new JTextField(12);
        add(priceTextField);

        JButton createButton = new JButton("Create_Vehicle");
        add(createButton);
    }
}
