package com.vehicles.view;
import javax.swing.*;

class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {
        JTabbedPane jTabbedPaneContainer = new JTabbedPane();
        setTitle("YCarros");
        setSize(600,500);
        add(jTabbedPaneContainer);
        jTabbedPaneContainer.setSize(550,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        CRUDVehicles crudVehicles = new CRUDVehicles();
        CRUDUsers crudUsers = new CRUDUsers();
        CRUDSell crudSell = new CRUDSell();
        Consult consult =new Consult();
        jTabbedPaneContainer.add("CRUDVehicles", crudVehicles);
        jTabbedPaneContainer.add("CRUDUsers", crudUsers);
        jTabbedPaneContainer.add("CRUDSell", crudSell);
        jTabbedPaneContainer.add("Consult", consult);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainMenu();
    }
}