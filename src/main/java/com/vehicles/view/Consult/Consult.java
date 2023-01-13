package com.vehicles.view.Consult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Consult extends JPanel implements ActionListener {
    /*TODO Create this component*/
        JPanel innerWindow = new JPanel();
        JTextArea textArea = new JTextArea();
        JButton listVehiclesByPrice = new JButton("List_By_Price");
        JButton listVehiclesByBrand = new JButton("List_By_Brand");
    public Consult(){
        setLayout(new GridLayout(3,1));
        JPanel listByPrice = new JPanel();
        JPanel listByBrand = new JPanel();

        JLabel minorPriceLabel = new JLabel("Minor_Price");
        listByPrice.add(minorPriceLabel);
        JTextField minorPriceTextField = new JTextField(12);
        listByPrice.add(minorPriceTextField);

        JLabel majorPriceLabel = new JLabel("Major_Price");
        listByPrice.add(majorPriceLabel);
        JTextField majorPriceTextField = new JTextField(12);
        listByPrice.add(majorPriceTextField);

        JLabel brandLabel = new JLabel("Brand");
        listByBrand.add(brandLabel);
        JTextField brandTextField = new JTextField(12);
        listByBrand.add(brandTextField);

        add(listByPrice);
        add(listByBrand);

        textArea.setFont(new Font("Serif", Font.ITALIC,16));
        listVehiclesByPrice.addActionListener(this);
        listVehiclesByBrand.addActionListener(this);
        listByPrice.add(listVehiclesByPrice);
        listByBrand.add(listVehiclesByBrand);
        innerWindow.add(new JScrollBar());
        add(innerWindow);
        textArea.setSize(300,300);
        innerWindow.add(textArea);
    }
        public void actionPerformed(ActionEvent e) {
            textArea.setText("");
            /*textArea.append()*/;
        }
}
