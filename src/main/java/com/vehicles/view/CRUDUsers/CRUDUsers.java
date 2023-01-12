package com.vehicles.view.CRUDUsers;
import javax.swing.*;

public class CRUDUsers extends JPanel{
    /*TODO Create this component*/
    public CRUDUsers(){
        setSize(800,500);
        JTabbedPane jTabbedPaneContainer = new JTabbedPane();
        add(jTabbedPaneContainer);

        Create createUser = new Create();
        Update updateUser = new Update();
        Delete deleteUser = new Delete();

        jTabbedPaneContainer.addTab("Create", createUser);
        jTabbedPaneContainer.addTab("Update", updateUser);
        jTabbedPaneContainer.addTab("Delete", deleteUser);
    }
}
