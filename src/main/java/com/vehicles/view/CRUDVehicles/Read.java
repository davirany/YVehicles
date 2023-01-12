package com.vehicles.view.CRUDVehicles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.vehicles.controller.VehiclesController;

public class Read extends JPanel implements ActionListener {
    /*TODO implements functionalities to this screen*/
        JPanel innerWindow = new JPanel();
        JTextArea textArea = new JTextArea();
        JButton listVehicles = new JButton("List all Vehicles");
    public Read() {
        textArea.setFont(new Font("Serif", Font.ITALIC,16));
        setLayout(new GridLayout(2,1));

        listVehicles.addActionListener(this);

        add(listVehicles);
        innerWindow.add(new JScrollBar());
        add(innerWindow);
        textArea.setSize(300,300);
        innerWindow.add(textArea);
    }
        public void actionPerformed(ActionEvent e) {
            textArea.setText("");
            textArea.append(VehiclesController.getVehicles().toString());
        }
}
