package com.vehicles.view.CRUDSell;

import javax.swing.*;

public class CRUDSell extends JPanel{
    /*TODO Create this component*/
    public CRUDSell(){
        setSize(800,500);
        JTabbedPane jTabbedPaneContainer = new JTabbedPane();
        add(jTabbedPaneContainer);

        Create createSell = new Create();
        Read readSell = new Read();
        Update updateSell = new Update();
        Delete deleteSell = new Delete();


        jTabbedPaneContainer.addTab("Create", createSell);
        jTabbedPaneContainer.addTab("Read",readSell);
        jTabbedPaneContainer.addTab("Update",updateSell);
        jTabbedPaneContainer.addTab("Delete",deleteSell);
    }
}
