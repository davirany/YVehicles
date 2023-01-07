package com.vehicles.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    private JPanel MainMenuPanel;
    private JPanel TabsButtonsPanel;
    private JButton CRUDVehicles;
    private JButton CRUDAdvertisements;
    private JButton CRUDUser;
    private JButton CRUDSell;
    private JButton Consult;
    private JTabbedPane tabbedPane;
    private JPanel CRUDVehiclesPanel;
    private JPanel CRUDAdvertisementsPanel;
    private JPanel CRUDUsersPanel;
    private JPanel CRUDSellsPanel;
    private JPanel ConsultPanel;

    /*TODO create a menu with tabs for each component*/
    /*https://youtu.be/Fj5y_intc5o*/

    public MainMenu() {
        super("YCarros");
        setSize(900, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(MainMenuPanel);
        CRUDVehicles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(0);
            }
        });

        CRUDAdvertisements.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(1);
            }
        });
        CRUDUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(2);
            }
        });
        Consult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(3);
            }
        });
        CRUDSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setSelectedIndex(4);
            }
        });
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
