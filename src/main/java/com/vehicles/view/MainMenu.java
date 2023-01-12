package com.vehicles.view;
import com.vehicles.view.CRUDSell.CRUDSell;
import com.vehicles.view.CRUDUsers.CRUDUsers;
import com.vehicles.view.CRUDVehicles.CRUDVehicles;
import com.vehicles.view.Consult.Consult;

import javax.swing.*;

class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {
        JTabbedPane jTabbedPaneContainer = new JTabbedPane();
        setTitle("YCarros");
        setSize(800,500);
        add(jTabbedPaneContainer);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CRUDVehicles crudVehicles = new CRUDVehicles();
        CRUDUsers crudUsers = new CRUDUsers();
        CRUDSell crudSell = new CRUDSell();
        Consult consult =new Consult();

        jTabbedPaneContainer.add("CRUD_Vehicles", crudVehicles);
        jTabbedPaneContainer.add("CRUD_Users", crudUsers);
        jTabbedPaneContainer.add("CRUD_Sell", crudSell);
        jTabbedPaneContainer.add("Consult", consult);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainMenu();
    }
}