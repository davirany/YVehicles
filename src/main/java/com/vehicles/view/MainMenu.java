package com.vehicles.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    private JPanel MainMenuPanel;
    private JTabbedPane tabbedPane;
    private JPanel CRUDVehiclesPanel;
    private JPanel CRUDAdvertisementsPanel;
    private JPanel CRUDUsersPanel;
    private JPanel CRUDSellsPanel;
    private JPanel ConsultPanel;

    public MainMenu() {
        super("YCarros");
        CRUDVehicles crudVehicles = new CRUDVehicles();
        setSize(1100, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(MainMenuPanel);
        CRUDVehiclesPanel.add(crudVehicles);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
