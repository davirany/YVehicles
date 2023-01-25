package com.vehicles;

import com.vehicles.model.*;
import com.vehicles.controller.VehiclesController;
import com.vehicles.controller.SellsController;
import com.vehicles.view.MainMenu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

public class Main {
    private final SellsController sellsController = new SellsController();
    private final VehiclesController vehiclesController = new VehiclesController();
    private final AdvertisingController advertisingController = new AdvertisingController();

    public static void main(String[] args) {
        MainMenu main = new MainMenu();
        main.initComponents();
    }

    private void execute() {
        Advertiser advertiser1 = new Advertiser("David", "61-91234-5678", "david@email", 0, 0);
        Buyer buyer1 = new Buyer("John", "61-99876-5432", "john@gmail.com", 0);

        Vehicle vehicle = addVehicle("Chevrolet", "Camaro", "Yellow", 0, 80000, 2022, 2023);
        vehiclesController.createVehicle(vehicle);
        Advertising advertising1 = new Advertising("Advertising of car 1", advertiser1, vehicle);
        addAdvertising(advertising1);
        advertisingController.createAdvertising(advertising1);

        Vehicle vehicle2 = addVehicle("Volkswagen", "Golf", "White", 100000, 52000, 2020, 2021);
        vehiclesController.createVehicle(vehicle2);
        Advertising advertising2 = new Advertising("Advertising of car 2", advertiser1, vehicle2);
        addAdvertising(advertising2);
        advertisingController.createAdvertising(advertising2);

        Vehicle vehicle3 = addVehicle("Ford", "Ka", "Black", 0, 65000, 2019, 2019);
        vehiclesController.createVehicle(vehicle3);
        Advertising advertising3 = new Advertising("Advertising of car 3", advertiser1, vehicle3);
        addAdvertising(advertising3);
        advertisingController.createAdvertising(advertising3);

        List<Vehicle> vehicles = vehiclesController.getVehicles();
        List<Sell> sells = sellsController.getSells();
        List<Advertising> advertisements = advertisingController.getAdvertisements();


        System.out.println("\n-----Three objects Vehicle were created-----");
        listVehicles(vehicles);
        System.out.println("\n-----Three objects Advertising were created-----");
        listAdvertisements(advertisements);
        System.out.println("\n-----Advertisements of advertiser1-----");
        listAdvertisedVehicles(advertiser1);
        System.out.println("\n-----A sell was made-----");
        Sell sell = addSell(advertising1, buyer1);
        sellsController.createSell(sell);
        listVehicles(vehicles);
        System.out.println("\n-----This was the Sell-----");
        listSells(sells);
        System.out.println("\n-----An object Advertising of the sell was deleted-----");
        listAdvertisements(advertisements);
        System.out.println("\n---list of bought vehicles by buyer1---");
        listBoughtVehicles(buyer1);
        System.out.println("\n-----Advertisements of advertiser1-----");
        listAdvertisedVehicles(advertiser1);
        System.out.println("\n-----Printing all vehicles by price-----");
        listByPrice(vehicles,6000, 100000);
        System.out.println("\n-----Printing all vehicles by brand-----");
        listByBrand(vehicles,"Ford");
    }

    private void listVehicles(List<Vehicle> vehicles) {
        vehicles.forEach(s -> System.out.println("#"+s.getId() + " --> brandName: " + s.getModel().getBrand()+" | vehicleName: "+s.getModel().getName() + " | color: " + s.getColor() + " | modelYear: " + s.getModelYear() + " | manufactureYear: " + s.getManufactureYear() + " | price: " + s.getPrice() + " | mileage: " + s.getMileage()));
    }

    private void listSells(List<Sell> sells) {
        sells.forEach(v -> System.out.println("#"+v.getId() + " --> advertisingId: " + v.getAdvertising().getId() + " | sellDate: " + v.getDate() + " | buyerName: " + v.getBuyer().getName()+" | buyerPhone: "+v.getBuyer().getPhone() + " | buyerEmail: " + v.getBuyer().getEmail() + " | amountBoughtCars: " + v.getBuyer().getAmountBoughtVehicles()));
    }

    private void listAdvertisements(List<Advertising> advertisements) {
        advertisements.forEach(a -> System.out.println("#"+a.getId() + " --> descriptions: " + a.getDescription() + " | advertiserName: " + a.getAdvertiser().getName() + " | vehicleName: " + a.getVehicle().getModel().getName() + " | vehicleId: #" + a.getVehicle().getId()));
    }

    private void listBoughtVehicles(Buyer buyer) {
        List<Vehicle> boughtVehicles = buyer.getBoughtVehicles();
        System.out.println("\n---vehicles bought by  " + buyer.getName() + "---");
        boughtVehicles.forEach(d -> System.out.println("#"+d.getId() + " --> brandName: " + d.getModel().getBrand()+" | vehicleName: "+d.getModel().getName() + " | color: " + d.getColor() + " | modelYear: " + d.getModelYear() + " | manufactureYear: " + d.getManufactureYear() + " | price: " + d.getPrice() + " | mileage: " + d.getMileage()));
    }

    private void listAdvertisedVehicles(Advertiser advertiser) {
        List<Vehicle> advertisedVehicle = advertiser.getAdvertisedVehicles();
        System.out.println("\n---list of advertised vehicles by " + advertiser.getName() + "---");
        advertisedVehicle.forEach(k -> System.out.println("#"+k.getId() + " --> brandName: " + k.getModel().getBrand()+" | vehicleName: "+k.getModel().getName() + " | color: " + k.getColor() + " | modelYear: " + k.getModelYear() + " | manufactureYear: " + k.getManufactureYear() + " | price: " + k.getPrice() + " | mileage: " + k.getMileage()));
    }

    public void listByPrice(List<Vehicle> vehicles,int smallPriceValue, int bigPriceValue) {
        vehicles.forEach(vehicle -> {
            if (vehicle.getPrice() >= smallPriceValue & vehicle.getPrice() <= bigPriceValue) {
                System.out.println("#" + vehicle.getId() + " | vehicleName: " + vehicle.getModel().getName() + " | vehicleBrand: " + vehicle.getModel().getBrand() + " | vehicleYear: " + vehicle.getManufactureYear());
            }
        });
    }

    public void listByBrand(List<Vehicle> vehicles, String brand) {
        vehicles.forEach(vehicle -> {
            if (Objects.equals(vehicle.getModel().getBrand(), brand)) {
                System.out.println("#"+vehicle.getId() + " --> brandName: " + vehicle.getModel().getBrand()+" | vehicleName: "+vehicle.getModel().getName() + " | color: " + vehicle.getColor() + " | modelYear: " + vehicle.getModelYear() + " | manufactureYear: " + vehicle.getManufactureYear() + " | price: " + vehicle.getPrice() + " | mileage: " + vehicle.getMileage());
            }
        });
    }

    private void addAdvertising(Advertising advertising) {
        Advertiser advertiser = advertising.getAdvertiser();
        advertiser.addAdvertisedCar(advertising.getVehicle());
    }

    private Vehicle addVehicle(String brandName, String modelName, String color, int mileage, int price, int manufactureYear, int modelYear) {
        Brand brand = createBrand(brandName, "Nationality", 2022);
        Model model = createModel(modelName, brand);
        int randomVehiclesId = (int)(Math.random()*(1500-500+1)+500);
        return new Vehicle(model, manufactureYear, modelYear, color, mileage, price, randomVehiclesId);
    }

    private Brand createBrand(String brandName, String nationality, int foundedIn) {
        return new Brand(brandName, nationality);
    }

    private Model createModel(String modelName, Brand brand) {
        return new Model(modelName, brand);
    }

    private Sell addSell(Advertising advertising, Buyer buyer) {
        int randomSellId = (int)(Math.random()*(1000-500+1)+500);
        String sellDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        Vehicle vehicle = advertising.getVehicle();
        buyer.addBoughtVehicle(advertising.getVehicle());
        Advertiser advertiser = advertising.getAdvertiser();
        advertiser.removeAdvertisedVehicle(advertising.getVehicle());
        vehiclesController.removeVehicle(vehicle);
        advertisingController.removeAdvertising(advertising);
        int bought = buyer.getAmountBoughtVehicles();
        buyer.setAmountBoughtVehicles(bought+1);
        advertising.getAdvertiser().setAmountVehiclesSold(buyer.getAmountBoughtVehicles()+1);
        return new Sell(advertising, buyer);
    }
}