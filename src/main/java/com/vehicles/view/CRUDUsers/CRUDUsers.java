package com.vehicles.view.CRUDUsers;

import javax.swing.*;

public class CRUDUsers extends JPanel{
    /*TODO Create this component*/
    public CRUDUsers(){
        JScrollPane scrollPane = new JScrollPane();
        JTextArea usersTextArea = new JTextArea(10,50);
        scrollPane.setViewportView(usersTextArea);
        setSize(550, 500);
        add(scrollPane);
        add(usersTextArea);
    }
}
