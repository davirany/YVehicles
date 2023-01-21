package com.vehicles.view;

import com.vehicles.controller.*;
import javax.swing.*;
import java.awt.*;

class MainMenu extends javax.swing.JFrame {
    VehiclesController vehiclesController = new VehiclesController();
    SellsController sellsController = new SellsController();
    AdvertisingController advertisingController = new AdvertisingController();
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

        //CRUDVehicles ->
        JPanel crudVehicles = new JPanel();
        setSize(800,500);
        JTabbedPane crudVehiclesJTabbedPane = new JTabbedPane();
        crudVehicles.add(crudVehiclesJTabbedPane);

        //CreateVehicle ->
        JLabel brandLabel = new JLabel("Brand");
        JTextField brandTextField = new JTextField(12);
        JLabel brandNationalityLabel = new JLabel("Nationality");
        JTextField brandNationalityTextField = new JTextField(12);
        JLabel modelLabel = new JLabel("Model");
        JTextField modelTextField = new JTextField(12);
        JLabel colorLabel = new JLabel("Color");
        JTextField colorTextField = new JTextField(12);
        JLabel mileageLabel = new JLabel("Mileage");
        JTextField mileageTextField = new JTextField(12);
        JLabel manuYearLabel = new JLabel("Manufacture_Year");
        JTextField manuYearTextField = new JTextField(4);
        JLabel modelYearLabel = new JLabel("Model_Year");
        JTextField modelYearTextField = new JTextField(4);
        JLabel priceLabel = new JLabel("Price");
        JTextField priceTextField = new JTextField(12);
        JButton createVehicleButton = new JButton("Create_Vehicle");

        JPanel createVehicle = new JPanel();

        createVehicle.setLayout(new GridLayout(9, 2));
        createVehicle.add(brandLabel);
        createVehicle.add(brandTextField);
        createVehicle.add(brandNationalityLabel);
        createVehicle.add(brandNationalityTextField);
        createVehicle.add(modelLabel);
        createVehicle.add(modelTextField);
        createVehicle.add(colorLabel);
        createVehicle.add(colorTextField);
        createVehicle.add(mileageLabel);
        createVehicle.add(mileageTextField);
        createVehicle.add(manuYearLabel);
        createVehicle.add(manuYearTextField);
        createVehicle.add(modelYearLabel);
        createVehicle.add(modelYearTextField);
        createVehicle.add(priceLabel);
        createVehicle.add(priceTextField);
        createVehicle.add(createVehicleButton);
        /*createVehicleButton.addActionListener();*/
        //End Of CreateVehicle

        //ReadVehicles ->
        JPanel readVehiclesPanel = new JPanel();
        JTextArea readVehiclesTextArea = new JTextArea();
        JButton listAllVehicles = new JButton("List_All_Vehicles");

        JPanel readVehicles = new JPanel();

        readVehiclesTextArea.setFont(new Font("Serif", Font.ITALIC,16));
        readVehicles.add(listAllVehicles);
        readVehiclesPanel.add(new JScrollBar());
        readVehicles.add(readVehiclesPanel);
        readVehiclesTextArea.setSize(300,300);
        readVehiclesPanel.add(readVehiclesTextArea);
        /*listAllVehicles.addActionListener();*/
        //End Of ReadVehicles

        //Update Vehicles ->
        JLabel updateVehicleIdLabel = new JLabel("ID_Of_The_Vehicle");
        JTextField updateVehicleIdTextField = new JTextField(3);
        JLabel updateVehicleBrandLabel = new JLabel("Brand");
        JTextField updateVehicleBrandTextField = new JTextField(12);
        JLabel updateVehicleNationalityLabel = new JLabel("Nationality");
        JTextField updateVehicleNationalityTextField = new JTextField(12);
        JLabel updateVehicleModelLabel = new JLabel("Model");
        JTextField updateVehicleModelTextField = new JTextField(12);
        JLabel updateVehicleColorLabel = new JLabel("Color");
        JTextField updateVehicleColorTextField = new JTextField(12);
        JLabel updateVehicleMileageLabel = new JLabel("Mileage");
        JTextField updateVehicleMileageTextField = new JTextField(12);
        JLabel updateVehicleManuYearLabel = new JLabel("Manufacture_Year");
        JTextField updateVehicleManuYearTextField = new JTextField(4);
        JLabel updateVehicleModelYearLabel = new JLabel("Model_Year");
        JTextField updateVehicleModelYearTextField = new JTextField(4);
        JLabel updateVehiclePriceLabel = new JLabel("Price");
        JTextField updateVehiclePriceTextField = new JTextField(12);
        JButton updateVehicle = new JButton("Update_Vehicle");

        JPanel updateVehicles = new JPanel();

        updateVehicles.setLayout(new GridLayout(10,2));

        updateVehicles.add(updateVehicleIdLabel);
        updateVehicles.add(updateVehicleIdTextField);
        updateVehicles.add(updateVehicleBrandLabel);
        updateVehicles.add(updateVehicleBrandTextField);
        updateVehicles.add(updateVehicleNationalityLabel);
        updateVehicles.add(updateVehicleNationalityTextField);
        updateVehicles.add(updateVehicleModelLabel);
        updateVehicles.add(updateVehicleModelTextField);
        updateVehicles.add(updateVehicleColorLabel);
        updateVehicles.add(updateVehicleColorTextField);
        updateVehicles.add(updateVehicleMileageLabel);
        updateVehicles.add(updateVehicleMileageTextField);
        updateVehicles.add(updateVehicleManuYearLabel);
        updateVehicles.add(updateVehicleManuYearTextField);
        updateVehicles.add(updateVehicleModelYearLabel);
        updateVehicles.add(updateVehicleModelYearTextField);
        updateVehicles.add(updateVehiclePriceLabel);
        updateVehicles.add(updateVehiclePriceTextField);
        updateVehicles.add(updateVehicle);
        /*updateVehicle.addActionListener();*/
        //End Of Update Vehicles

        //Delete Vehicles ->
        JLabel deleteVehiclesIdVehicles = new JLabel("ID_Of_The_Vehicle");
        JTextField deleteVehiclesTextField = new JTextField(4);
        JButton deleteVehiclesButton = new JButton("Delete_Vehicle");

        JPanel deleteVehicles = new JPanel();

        deleteVehicles.add(deleteVehiclesIdVehicles);
        deleteVehicles.add(deleteVehiclesTextField);
        deleteVehicles.add(deleteVehiclesButton);
        //End Of Delete Vehicles

        crudVehiclesJTabbedPane.addTab("Create", createVehicle);
        crudVehiclesJTabbedPane.addTab("Read",readVehicles);
        crudVehiclesJTabbedPane.addTab("Update",updateVehicles);
        crudVehiclesJTabbedPane.addTab("Delete",deleteVehicles);
        //End Of CRUDVehicles

        //CRUDSell ->
        JPanel crudSellPanel = new JPanel();
        crudSellPanel.setSize(800,500);
        //Create Sell ->
        JTabbedPane crudSellJTabbedPaneContainer = new JTabbedPane();
        crudSellPanel.add(crudSellJTabbedPaneContainer);

        JPanel createSellPanel = new JPanel();
        createSellPanel.setLayout(new GridLayout(2,2));
        //Create Advertiser ->
        JLabel createAdvertiserNameLabel = new JLabel("Advertiser_Name");
        JTextField createAdvertiserNameTextField = new JTextField(12);
        JLabel createAdvertiserPhoneLabel = new JLabel("Advertiser_Phone");
        JTextField createAdvertiserPhoneTextField = new JTextField(12);
        JLabel createAdvertiserEmailLabel = new JLabel("Advertiser_Email");
        JTextField createAdvertiserEmailTextField = new JTextField(12);
        JLabel createAdvertiserActiveAdsLabel = new JLabel("Advertiser_ActiveAds");
        JTextField createAdvertiserActiveAdsTextField = new JTextField(12);
        JLabel createAdvertiserVehiclesSoldLabel = new JLabel("Advertiser_Vehicles_Sold");
        JTextField createAdvertiserVehiclesSoldTextField = new JTextField(12);

        JPanel createAdvertiserPanel = new JPanel();

        createAdvertiserPanel.setLayout(new GridLayout(6,2));
        createAdvertiserPanel.add(createAdvertiserNameLabel);
        createAdvertiserPanel.add(createAdvertiserNameTextField);
        createAdvertiserPanel.add(createAdvertiserPhoneLabel);
        createAdvertiserPanel.add(createAdvertiserPhoneTextField);
        createAdvertiserPanel.add(createAdvertiserEmailLabel);
        createAdvertiserPanel.add(createAdvertiserEmailTextField);
        createAdvertiserPanel.add(createAdvertiserActiveAdsLabel);
        createAdvertiserPanel.add(createAdvertiserActiveAdsTextField);
        createAdvertiserPanel.add(createAdvertiserVehiclesSoldLabel);
        createAdvertiserPanel.add(createAdvertiserVehiclesSoldTextField);
        //End Of Create Advertiser

        //Create Buyer ->
        JLabel createBuyerNameLabel = new JLabel("Buyer_Name");
        JTextField createBuyerNameTextField = new JTextField(12);
        JLabel createBuyerPhoneLabel = new JLabel("Buyer_Phone");
        JTextField createBuyerPhoneTextField = new JTextField(12);
        JLabel createBuyerEmailLabel = new JLabel("Buyer_Email");
        JTextField createBuyerEmailTextField = new JTextField(12);
        JLabel createBuyerVehiclesBoughtLabel = new JLabel("Buyer_Vehicles_Bought");
        JTextField createBuyerVehiclesBoughtTextField = new JTextField(12);

        JPanel createBuyerPanel = new JPanel();

        createBuyerPanel.setLayout(new GridLayout(5,2));
        createBuyerPanel.add(createBuyerNameLabel);
        createBuyerPanel.add(createBuyerNameTextField);
        createBuyerPanel.add(createBuyerPhoneLabel);
        createBuyerPanel.add(createBuyerPhoneTextField);
        createBuyerPanel.add(createBuyerEmailLabel);
        createBuyerPanel.add(createBuyerEmailTextField);
        createBuyerPanel.add(createBuyerVehiclesBoughtLabel);
        createBuyerPanel.add(createBuyerVehiclesBoughtTextField);
        //End Of Create Buyer

        //Create Sell Vehicle ->
        JLabel createSellVehicleIdLabel = new JLabel("Vehicle_ID");
        JTextField createSellVehicleIdTextField = new JTextField(12);

        JPanel createVehiclePanel = new JPanel();

        createVehiclePanel.add(createSellVehicleIdLabel);
        createVehiclePanel.add(createSellVehicleIdTextField);
        //End Of Create Sell Vehicle

        //Create Sell Button ->
        JButton createSell = new JButton("Create_Sell");

        JPanel createSellButtonPanel = new JPanel();

        createSellButtonPanel.add(createSell);
        //End Of Create Sell Button
        createSellPanel.add(createAdvertiserPanel);
        createSellPanel.add(createBuyerPanel);
        createSellPanel.add(createVehiclePanel);
        createSellPanel.add(createSellButtonPanel);
        //End Of Create Sell

        //Read Vehicles ->
        JPanel readSellsInnerWindow = new JPanel();
        JTextArea textArea = new JTextArea();
        JButton listSells = new JButton("List_All_Sells");

        JPanel readSellsPanel = new JPanel();

        textArea.setFont(new Font("Serif", Font.ITALIC,16));
        readSellsPanel.add(listSells);
        readSellsInnerWindow.add(new JScrollBar());
        readSellsPanel.add(readSellsInnerWindow);
        textArea.setSize(300,300);
        readSellsInnerWindow.add(textArea);
        //End Of Read Vehicles

        //Update Sell ->
        JPanel updateSellPanel = new JPanel();
        updateSellPanel.setLayout(new GridLayout(3,2));

        //Update Advertiser ->
        JLabel updateAdvertiserNameLabel = new JLabel("Advertiser_Name");
        JTextField updateAdvertiserNameTextField = new JTextField(12);
        JLabel updateAdvertiserPhoneLabel = new JLabel("Advertiser_Phone");
        JTextField updateAdvertiserPhoneTextField = new JTextField(12);
        JLabel updateAdvertiserEmailLabel = new JLabel("Advertiser_Email");
        JTextField updateAdvertiserEmailTextField = new JTextField(12);
        JLabel updateAdvertiserActiveAdsLabel = new JLabel("Advertiser_ActiveAds");
        JTextField updateAdvertiserActiveAdsTextField = new JTextField(12);
        JLabel updateAdvertiserVehiclesSoldLabel = new JLabel("Advertiser_Vehicles_Sold");
        JTextField updateAdvertiserVehiclesSoldTextField = new JTextField(12);

        JPanel updateAdvertiserPanel = new JPanel();

        updateAdvertiserPanel.setLayout(new GridLayout(6,2));
        updateAdvertiserPanel.add(updateAdvertiserNameLabel);
        updateAdvertiserPanel.add(updateAdvertiserNameTextField);
        updateAdvertiserPanel.add(updateAdvertiserPhoneLabel);
        updateAdvertiserPanel.add(updateAdvertiserPhoneTextField);
        updateAdvertiserPanel.add(updateAdvertiserEmailLabel);
        updateAdvertiserPanel.add(updateAdvertiserEmailTextField);
        updateAdvertiserPanel.add(updateAdvertiserActiveAdsLabel);
        updateAdvertiserPanel.add(updateAdvertiserActiveAdsTextField);
        updateAdvertiserPanel.add(updateAdvertiserVehiclesSoldLabel);
        updateAdvertiserPanel.add(updateAdvertiserVehiclesSoldTextField);
        //End Of Update Advertiser

        //Update Buyer ->
        JLabel updateBuyerNameLabel = new JLabel("Buyer_Name");
        JTextField updateBuyerNameTextField = new JTextField(12);
        JLabel updateBuyerPhoneLabel = new JLabel("Buyer_Phone");
        JTextField updateBuyerPhoneTextField = new JTextField(12);
        JLabel updateBuyerEmailLabel = new JLabel("Buyer_Email");
        JTextField updateBuyerEmailTextField = new JTextField(12);
        JLabel updateBuyerVehiclesBoughtLabel = new JLabel("Buyer_Vehicles_Bought");
        JTextField updateBuyerVehiclesBoughtTextField = new JTextField(12);

        JPanel updateBuyerPanel = new JPanel();

        updateBuyerPanel.setLayout(new GridLayout(5,2));
        updateBuyerPanel.add(updateBuyerNameLabel);
        updateBuyerPanel.add(updateBuyerNameTextField);
        updateBuyerPanel.add(updateBuyerPhoneLabel);
        updateBuyerPanel.add(updateBuyerPhoneTextField);
        updateBuyerPanel.add(updateBuyerEmailLabel);
        updateBuyerPanel.add(updateBuyerEmailTextField);
        updateBuyerPanel.add(updateBuyerVehiclesBoughtLabel);
        updateBuyerPanel.add(updateBuyerVehiclesBoughtTextField);
        //End Of Update Buyer

        //Update Vehicle ->
        JLabel updateSellVehicleIdLabel = new JLabel("Vehicle_ID");
        JTextField updateSellVehicleIdTextField = new JTextField(12);

        JPanel updateVehiclePanel = new JPanel();

        updateVehiclePanel.add(updateSellVehicleIdLabel);
        updateVehiclePanel.add(updateSellVehicleIdTextField);
        //End Of Update Vehicle

        //Update Sell Date ->
        JPanel updateSellDatePanel = new JPanel();
        JLabel updateSellDateLabel = new JLabel("Sell_Date");
        JTextField updateSellDateTextField = new JTextField(12);

        updateSellDatePanel.add(updateSellDateLabel);
        updateSellDatePanel.add(updateSellDateTextField);
        //End Of Update Sell Date

        //Update Sell Button ->
        JButton updateSell = new JButton("Update_Sell");

        JPanel updateSellButtonPanel = new JPanel();

        updateSellButtonPanel.add(updateSell);
        //End Of Update Sell Button

        updateSellPanel.add(updateAdvertiserPanel);
        updateSellPanel.add(updateBuyerPanel);
        updateSellPanel.add(updateVehiclePanel);
        updateSellPanel.add(updateSellDatePanel);
        updateSellPanel.add(updateSellButtonPanel);
        //End Of Update Sell

        //Delete Sell ->
        JLabel deleteSellIdSell = new JLabel("ID_Of_The_Sell");
        JTextField deleteSellTextField = new JTextField(4);
        JButton deleteSellButton = new JButton("Delete_sell");

        JPanel deleteSellPanel = new JPanel();

        deleteSellPanel.add(deleteSellIdSell);
        deleteSellPanel.add(deleteSellTextField);
        deleteSellPanel.add(deleteSellButton);
        //End Of Delete Sell


        crudSellJTabbedPaneContainer.addTab("Create", createSellPanel);
        crudSellJTabbedPaneContainer.addTab("Read",readSellsPanel);
        crudSellJTabbedPaneContainer.addTab("Update",updateSellPanel);
        crudSellJTabbedPaneContainer.addTab("Delete",deleteSellPanel);
        //End Of CRUDSell

        //Consult ->
        JPanel consultInnerWindow = new JPanel();
        JTextArea consultTextArea = new JTextArea();
        JButton listVehiclesByPrice = new JButton("List_By_Price");
        JButton listVehiclesByBrand = new JButton("List_By_Brand");
        JPanel listByPrice = new JPanel();
        JPanel listByBrand = new JPanel();
        JLabel minorPriceLabel = new JLabel("Minor_Price");
        JTextField minorPriceTextField = new JTextField(12);
        JLabel majorPriceLabel = new JLabel("Major_Price");
        JTextField majorPriceTextField = new JTextField(12);
        JLabel consultBrandLabel = new JLabel("Brand");
        JTextField consultBrandTextField = new JTextField(12);

        JPanel consultPanel = new JPanel();

        consultPanel.setLayout(new GridLayout(3,1));
        listByPrice.add(minorPriceLabel);
        listByPrice.add(minorPriceTextField);
        listByPrice.add(majorPriceLabel);
        listByPrice.add(majorPriceTextField);
        listByBrand.add(consultBrandLabel);
        listByBrand.add(consultBrandTextField);
        consultPanel.add(listByPrice);
        consultPanel.add(listByBrand);

        consultTextArea.setFont(new Font("Serif", Font.ITALIC,16));
        /*listVehiclesByPrice.addActionListener(this);
        listVehiclesByBrand.addActionListener(this);*/
        listByPrice.add(listVehiclesByPrice);
        listByBrand.add(listVehiclesByBrand);
        consultInnerWindow.add(new JScrollBar());
        consultPanel.add(consultInnerWindow);
        consultTextArea.setSize(300,300);
        consultInnerWindow.add(consultTextArea);
        //End Of Consult

        jTabbedPaneContainer.add("CRUD_Vehicles", crudVehicles);
        jTabbedPaneContainer.add("CRUD_Sell", crudSellPanel);
        jTabbedPaneContainer.add("Consult", consultPanel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MainMenu();
    }
}