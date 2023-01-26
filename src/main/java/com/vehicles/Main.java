package com.vehicles;

import com.vehicles.model.*;
import com.vehicles.view.MainMenu;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    public Main() {};

    private void execute() {

        MainMenu mainMenu = new MainMenu();

        Brand brand1 = new Brand("Chevrolet", "American");
        Model model1 = new Model("Camaro", brand1);
        Vehicle vehicle1 = new Vehicle(model1, 2022, 2023, "Yellow", 0, 200000);
        mainMenu.vehiclesController.createVehicle(vehicle1);

        Brand brand2 = new Brand("Volkswagen", "German");
        Model model2 = new Model("Golf", brand2);
        Vehicle vehicle2 = new Vehicle(model2, 2022, 2023, "White", 100000, 200000);
        mainMenu.vehiclesController.createVehicle(vehicle2);

        Brand brand3 = new Brand("Ford", "American");
        Model model3 = new Model("Ka", brand3);
        Vehicle vehicle3 = new Vehicle(model3, 2019, 2019, "Black", 100000, 65000);
        mainMenu.vehiclesController.createVehicle(vehicle3);

        mainMenu.initComponents();
    }

}