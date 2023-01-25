package com.vehicles.view;

import com.vehicles.controller.*;
import com.vehicles.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class MainMenu {
    VehiclesController vehiclesController = new VehiclesController();
    SellsController sellsController = new SellsController();
    AdvertisingController advertisingController = new AdvertisingController();

    //MainMenu ->
    JFrame mainMenu = new JFrame("YCarros");
    JTabbedPane jTabbedPaneContainer = new JTabbedPane();
    //End Of MainMenu

    //crudVehicles ->
    JPanel crudVehicles = new JPanel();
    JTabbedPane crudVehiclesJTabbedPane = new JTabbedPane();

    //CreateVehicles ->
    JButton createSell = new JButton("Create_Sell");
    JPanel createSellButtonPanel = new JPanel();

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
    //End Of CreateVehicles

    //ReadVehicles ->
    JPanel readVehiclesPanel = new JPanel();
    JTextArea readVehiclesTextArea = new JTextArea(10,40);
    JButton listAllVehicles = new JButton("List_All_Vehicles");
    JScrollPane readVehiclesScrollPane = new JScrollPane(readVehiclesTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    JPanel readVehicles = new JPanel();
    //End Of ReadVehicles

    //UpdateVehicles ->
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
    //End Of UpdateVehicles

    //DeleteVehicles ->
    JLabel deleteVehiclesIdVehicles = new JLabel("ID_Of_The_Vehicle");
    JTextField deleteVehiclesTextField = new JTextField(4);
    JButton deleteVehiclesButton = new JButton("Delete_Vehicle");

    JPanel deleteVehicles = new JPanel();
    //End Of DeleteVehicles
    //End Of crudVehicles

    //crudSells ->
    JPanel crudSellPanel = new JPanel();
    //CreateSell ->
    JTabbedPane crudSellJTabbedPaneContainer = new JTabbedPane();

    JPanel createSellPanel = new JPanel();

    //CreateAdvertiser
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
    //End Of CreateAdvertiser

    //CreateBuyer->
    JLabel createBuyerNameLabel = new JLabel("Buyer_Name");
    JTextField createBuyerNameTextField = new JTextField(12);
    JLabel createBuyerPhoneLabel = new JLabel("Buyer_Phone");
    JTextField createBuyerPhoneTextField = new JTextField(12);
    JLabel createBuyerEmailLabel = new JLabel("Buyer_Email");
    JTextField createBuyerEmailTextField = new JTextField(12);
    JLabel createBuyerVehiclesBoughtLabel = new JLabel("Buyer_Vehicles_Bought");
    JTextField createBuyerVehiclesBoughtTextField = new JTextField(12);

    JPanel createBuyerPanel = new JPanel();
    //End Of CreateBuyer

    //VehicleSell ->
    JLabel createSellVehicleIdLabel = new JLabel("Vehicle_ID");
    JTextField createSellVehicleIdTextField = new JTextField(12);

    JPanel createVehiclePanel = new JPanel();
    //End Of VehicleSell
    //End Of CreateSell

    //ReadSell ->
    JPanel readSellsInnerWindow = new JPanel();
    JTextArea readSellsTextArea = new JTextArea(10,40);
    JButton readSells = new JButton("Read_Sells");

    JPanel readSellsPanel = new JPanel();
    //End Of ReadSell

    //UpdateSell ->
    JPanel updateSellPanel = new JPanel();
    //End Of UpdateSell

    //UpdateAdvertiser ->
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
    //End Of UpdateAdvertiser

    //UpdateBuyer ->
    JLabel updateBuyerNameLabel = new JLabel("Buyer_Name");
    JTextField updateBuyerNameTextField = new JTextField(12);
    JLabel updateBuyerPhoneLabel = new JLabel("Buyer_Phone");
    JTextField updateBuyerPhoneTextField = new JTextField(12);
    JLabel updateBuyerEmailLabel = new JLabel("Buyer_Email");
    JTextField updateBuyerEmailTextField = new JTextField(12);
    JLabel updateBuyerVehiclesBoughtLabel = new JLabel("Buyer_Vehicles_Bought");
    JTextField updateBuyerVehiclesBoughtTextField = new JTextField(12);

    JPanel updateBuyerPanel = new JPanel();
    //End Of UpdateAdvertiser

    //UpdateVehicleButton ->
    //End Of UpdateVehicleButton

    JLabel updateSellVehicleIdLabel = new JLabel("Vehicle_ID");
    JTextField updateSellVehicleIdTextField = new JTextField(12);

    JPanel updateVehiclePanel = new JPanel();

    //UpdateSellDate ->
    JPanel updateSellDatePanel = new JPanel();
    JLabel updateSellDateLabel = new JLabel("Sell_Date");
    JTextField updateSellDateTextField = new JTextField(12);
    //End Of UpdateSellDate

    //UpdateSellButton
    JButton updateSell = new JButton("Update_Sell");

    JPanel updateSellButtonPanel = new JPanel();
    //End Of UpdateSellButton

    //DeleteSell
    JLabel deleteSellIdSell = new JLabel("ID_Of_The_Sell");
    JTextField deleteSellTextField = new JTextField(4);
    JButton deleteSellButton = new JButton("Delete_sell");

    JPanel deleteSellPanel = new JPanel();
    //End Of DeleteSell
    //End Of crudSells

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
    //End Of Consult
    public MainMenu() {
        initComponents();
    }

    public void initComponents() {
        mainMenu.setSize(800,500);
        mainMenu.add(jTabbedPaneContainer);
        mainMenu.setLocationRelativeTo(null);
        mainMenu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //CRUDVehicles ->
        crudVehicles.add(crudVehiclesJTabbedPane);

        //CreateVehicle ->
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
        createVehicleButton.addActionListener(this::createVehicle);
        //End Of CreateVehicle

        //ReadVehicles ->
        readVehiclesTextArea.setFont(new Font("Serif", Font.ITALIC,16));
        readVehicles.add(listAllVehicles);
        readVehicles.add(readVehiclesScrollPane);
        readVehicles.add(readVehiclesPanel);
        readVehiclesTextArea.setBounds(0,0,300,300);
        readVehiclesPanel.add(readVehiclesTextArea);
        listAllVehicles.addActionListener(this::readVehicles);
        //End Of ReadVehicles

        //Update Vehicles ->
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
        updateVehicle.addActionListener(this::updateVehicle);
        //End Of Update Vehicles

        //Delete Vehicles ->
        deleteVehicles.add(deleteVehiclesIdVehicles);
        deleteVehicles.add(deleteVehiclesTextField);
        deleteVehicles.add(deleteVehiclesButton);
        deleteVehiclesButton.addActionListener(this::deleteVehicle);
        //End Of Delete Vehicles

        crudVehiclesJTabbedPane.addTab("Create", createVehicle);
        crudVehiclesJTabbedPane.addTab("Read",readVehicles);
        crudVehiclesJTabbedPane.addTab("Update",updateVehicles);
        crudVehiclesJTabbedPane.addTab("Delete",deleteVehicles);
        //End Of CRUDVehicles

        //CRUDSell ->
        crudSellPanel.setSize(800,500);
        //Create Sell ->
        crudSellPanel.add(crudSellJTabbedPaneContainer);
        createSellPanel.setLayout(new GridLayout(2,2));
        //Create Advertiser ->
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
        createVehiclePanel.add(createSellVehicleIdLabel);
        createVehiclePanel.add(createSellVehicleIdTextField);
        //End Of Create Sell Vehicle

        //Create Sell Button ->
        createSellButtonPanel.add(createSell);
        //End Of Create Sell Button
        createSellPanel.add(createAdvertiserPanel);
        createSellPanel.add(createBuyerPanel);
        createSellPanel.add(createVehiclePanel);
        createSellPanel.add(createSellButtonPanel);
        createSell.addActionListener(this::createSell);
        //End Of Create Sell

        //Read Vehicles ->
        readSellsTextArea.setFont(new Font("Serif", Font.ITALIC,16));
        readSellsPanel.add(readSells);
        readSellsInnerWindow.add(new JScrollBar());
        readSellsPanel.add(readSellsInnerWindow);
        readSellsTextArea.setSize(300,300);
        readSellsInnerWindow.add(readSellsTextArea);
        readSells.addActionListener(this::readSells);
        //End Of Read Vehicles

        //Update Sell ->
        updateSellPanel.setLayout(new GridLayout(3,2));

        //Update Advertiser ->
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
        updateVehiclePanel.add(updateSellVehicleIdLabel);
        updateVehiclePanel.add(updateSellVehicleIdTextField);
        //End Of Update Vehicle

        //Update Sell Date ->
        updateSellDatePanel.add(updateSellDateLabel);
        updateSellDatePanel.add(updateSellDateTextField);
        //End Of Update Sell Date

        //Update Sell Button ->
        updateSellButtonPanel.add(updateSell);
        updateSell.addActionListener(this::updateSell);
        //End Of Update Sell Button

        updateSellPanel.add(updateAdvertiserPanel);
        updateSellPanel.add(updateBuyerPanel);
        updateSellPanel.add(updateVehiclePanel);
        updateSellPanel.add(updateSellDatePanel);
        updateSellPanel.add(updateSellButtonPanel);
        //End Of Update Sell

        //Delete Sell ->
        deleteSellPanel.add(deleteSellIdSell);
        deleteSellPanel.add(deleteSellTextField);
        deleteSellPanel.add(deleteSellButton);
        deleteSellButton.addActionListener(this::deleteSell);
        //End Of Delete Sell


        crudSellJTabbedPaneContainer.addTab("Create", createSellPanel);
        crudSellJTabbedPaneContainer.addTab("Read",readSellsPanel);
        crudSellJTabbedPaneContainer.addTab("Update",updateSellPanel);
        crudSellJTabbedPaneContainer.addTab("Delete",deleteSellPanel);
        //End Of CRUDSell

        //Consult ->
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
        mainMenu.setVisible(true);
    }

    private void createVehicle(ActionEvent actionEvent) {
        Brand brand = new Brand(brandTextField.getText(), brandNationalityTextField.getText());
        Model model = new Model(modelTextField.getText(), brand);
        Vehicle vehicle = new Vehicle(model, Integer.parseInt(manuYearTextField.getText()), Integer.parseInt(modelYearTextField.getText()), colorTextField.getText(), Integer.parseInt(mileageTextField.getText()), Integer.parseInt(priceTextField.getText()));

        vehiclesController.createVehicle(vehicle);
        JOptionPane.showMessageDialog(null,"Vehicle_Created!");
    }

    private void readVehicles(ActionEvent actionEvent) {
        readVehiclesTextArea.setText("");
        List<Vehicle> vehicles = vehiclesController.getVehicles();
        vehicles.forEach(vehicle -> readVehiclesTextArea.append("#"+vehicle.getId() + " --> brandName: " + vehicle.getModel().getBrand()+" | vehicleName: "+vehicle.getModel().getName() + "\n"));
    }


    private void updateVehicle(ActionEvent actionEvent) {
        List<Vehicle> vehicles = vehiclesController.getVehicles();
        vehicles.forEach( vehicle -> {
            if (vehicle.getId() == Integer.parseInt(updateVehicleIdTextField.getText())) {
                Brand newBrand = new Brand(updateVehicleBrandTextField.getText(), updateVehicleNationalityTextField.getText());
                Model newModel = new Model(updateVehicleModelTextField.getText(), newBrand);
                vehicle.setModel(newModel);
                vehicle.setColor(updateVehicleColorTextField.getText());
                vehicle.setMileage(Integer.parseInt(updateVehicleMileageTextField.getText()));
                vehicle.setModelYear(Integer.parseInt(updateVehicleModelYearTextField.getText()));
                vehicle.setManufactureYear(Integer.parseInt(updateVehicleManuYearTextField.getText()));
                vehicle.setPrice(Integer.parseInt(updateVehiclePriceTextField.getText()));
                JOptionPane.showMessageDialog(null,"Vehicle_Updated!");
            }
        });

    }

    private void deleteVehicle (ActionEvent actionEvent) {
        List<Vehicle> vehicles = vehiclesController.getVehicles();
        vehicles.forEach(vehicle -> {
            if (vehicle.getId() == Integer.parseInt(deleteVehiclesTextField.getText())) {
                vehiclesController.removeVehicle(vehicle);
            } else {
                JOptionPane.showMessageDialog(null, "Vehicle_#" + updateVehicleIdTextField.getText() + "_not_found!");
            }
        });
    }
    private void createSell(ActionEvent actionEvent) {
        List<Vehicle> vehicles = vehiclesController.getVehicles();
        vehicles.forEach(vehicle -> {
            if (vehicle.getId() == Integer.parseInt(createSellVehicleIdTextField.getText())) {
                Advertiser advertiser = new Advertiser(createAdvertiserNameTextField.getText(), createAdvertiserPhoneTextField.getText(), createAdvertiserEmailTextField.getName(), Integer.parseInt(createAdvertiserActiveAdsTextField.getText()), Integer.parseInt(createAdvertiserVehiclesSoldTextField.getText()));
                Advertising advertising = new Advertising("This is the advertising of the car #" + vehicle.getId(), advertiser, vehicle);
                Buyer buyer = new Buyer(createBuyerNameTextField.getText(),createBuyerPhoneTextField.getText(), createBuyerEmailTextField.getText(), Integer.parseInt(createBuyerVehiclesBoughtTextField.getText()));
                Sell sell = new Sell(advertising, buyer);
                sellsController.createSell(sell);
                JOptionPane.showMessageDialog(null, "Sell_Created!");
            }
        });
    }
    private void readSells (ActionEvent actionEvent){
        readSellsTextArea.setText("");
        List<Sell> sells = sellsController.getSells();
        sells.forEach(sell -> {
            readSellsTextArea.append("#" + sell.getId() + " --> vehicleId: " + sell.getAdvertising().getVehicle().getId() + " | advertiserName: " + sell.getAdvertising().getAdvertiser().getName() + " | buyerName: " + sell.getBuyer().getName() + " | dateOfTheSell: " + sell.getDate() + "\n");
        });
    }
    private void updateSell(ActionEvent actionEvent) {
    List<Sell> sells = sellsController.getSells();
    sells.forEach(sell -> {
        if (sell.getAdvertising().getVehicle().getId() == Integer.parseInt(updateSellVehicleIdTextField.getText())) {
            Advertising updatedAdvertising = sell.getAdvertising();
            Advertiser updatedAdvertiser = sell.getAdvertising().getAdvertiser();
            updatedAdvertiser.setAmountActiveAds(Integer.parseInt(updateAdvertiserActiveAdsTextField.getText()));
            updatedAdvertiser.setAmountVehiclesSold(Integer.parseInt(updateAdvertiserVehiclesSoldTextField.getText()));
            updatedAdvertiser.setName(updateAdvertiserNameTextField.getText());
            updatedAdvertiser.setEmail(updateAdvertiserEmailTextField.getText());
            updatedAdvertiser.setPhone(updateAdvertiserPhoneTextField.getText());

            updatedAdvertising.setAdvertiser(updatedAdvertiser);
            sell.setAdvertising(updatedAdvertising);

            Buyer updatedBuyer = sell.getBuyer();

            updatedBuyer.setAmountBoughtVehicles(Integer.parseInt(updateBuyerVehiclesBoughtTextField.getText()));
            updatedBuyer.setEmail(updateBuyerEmailTextField.getText());
            updatedBuyer.setName(updateBuyerNameTextField.getText());
            updatedBuyer.setPhone(updateBuyerPhoneTextField.getText());

            sell.setBuyer(updatedBuyer);

            sell.setDate(updateSellDateTextField.getText());
            JOptionPane.showMessageDialog(null,"Sell_Updated!");
        }
    });
    }
    private void deleteSell(ActionEvent actionEvent) {
        List<Sell> sells = sellsController.getSells();
        sells.forEach(sell -> {
            if (sell.getId() == Integer.parseInt(deleteSellTextField.getText())) {
            sellsController.removeSell(sell);
            }
        });
        JOptionPane.showMessageDialog(null,"Sell_Deleted!");
    }

    /*TODO implement consult*/
    public static void main(String[] args) {
        new MainMenu();
    }
}