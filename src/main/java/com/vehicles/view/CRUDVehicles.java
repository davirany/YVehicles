package com.vehicles.view;

import javax.swing.*;
import java.awt.*;

public class CRUDVehicles extends JPanel{
    private JPanel CRUDVehiclesPanel;
    private JTabbedPane tabbedPane1;
    private JPanel create;
    private JPanel list;
    private JPanel listByPrice;
    private JPanel listByBrand;
    private JComboBox brand;
    private JComboBox model;
    private JComboBox manufactureYear;
    private JComboBox modelYear;
    private JComboBox color;
    private JComboBox mileage;
    private JComboBox price;
    private JButton listAllVehiclesButton;
    private JTextField minorPriceTextField;
    private JTextField majorPriceTextField;
    private JLabel minorPrice;
    private JLabel majorPrice;
    private JTextField textField1;
    private JLabel Brand;
    private JTextPane textPane1;
    private JTextPane textPane2;
    private JButton searchButton1;
    private JButton searchButton2;
    private JTextPane textPane3;

    public CRUDVehicles() {
        setSize(1100, 700);
        setVisible(true);
        add(tabbedPane1);
        setBackground(Color.BLUE);
    }
}
