package com.vehicles.view.CRUDVehicles;

import javax.swing.*;

public class CRUDVehicles extends JPanel {
    /*TODO Create this component*/
    public CRUDVehicles() {
        setSize(800,500);
        JTabbedPane jTabbedPaneContainer = new JTabbedPane();
        add(jTabbedPaneContainer);

        Create createVehicles = new Create();
        Read readVehicles = new Read();
        Update updateVehicles = new Update();
        Delete deleteVehicles = new Delete();


        jTabbedPaneContainer.addTab("Create", createVehicles);
        jTabbedPaneContainer.addTab("Read",readVehicles);
        jTabbedPaneContainer.addTab("Update",updateVehicles);
        jTabbedPaneContainer.addTab("Delete",deleteVehicles);
    }
}
