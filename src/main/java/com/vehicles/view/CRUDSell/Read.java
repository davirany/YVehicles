package com.vehicles.view.CRUDSell;


import com.vehicles.controller.SellsController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Read extends JPanel implements ActionListener {
    JPanel innerWindow = new JPanel();
    JTextArea textArea = new JTextArea();
    JButton listSells = new JButton("List_All_Sells");
    public Read() {
        textArea.setFont(new Font("Serif", Font.ITALIC,16));
        listSells.addActionListener(this);
        add(listSells);
        innerWindow.add(new JScrollBar());
        add(innerWindow);
        textArea.setSize(300,300);
        innerWindow.add(textArea);
    }
    public void actionPerformed(ActionEvent e) {
        textArea.setText("");
        textArea.append(SellsController.getSells().toString());
    }
}
