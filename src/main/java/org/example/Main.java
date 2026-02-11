package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        CarService carService = new CarService(new ArrayList<>());
        ExportReportPrinter exportReportPrinter = new ExportReportPrinter();

        Car sport = new Sport("Ferrari", "Modelo 1", TypeFuel.GASOLINE, 2020, 200.00);
        Car Suv = new SUV("Toyota", "Modelo 3", TypeFuel.DIESEL, 1999, Traction.FOUR_FOUR);
        Car Sedan = new Sedan("BMW", "Modelo X", TypeFuel.ELECTRIC, 2023, 200.50);


        System.out.println("---1.ADDING CARS TO THE CAR SERVICE---");
        carService.addCar(sport);
        carService.addCar(Suv);
        carService.addCar(Sedan);

        System.out.println("---2.SHOWING ALL THE CARS ON THE LIST---");
        carService.listCars();

        System.out.println("---3.SHOWING FILTER BY YEAR---");
        carService.filterByYear(2019).forEach(car -> System.out.println(car.getBrand() + car.getModel()));

        System.out.println("---4.SHOWING FILTER BY TYPE AND FUEL---");
        carService.filterByTypeAndFuel(Sport, TypeFuel.DIESEL).forEach(car -> System.out.println(car.getBrand() + car.getModel()));

        //exportReportPrinter.printReport(sport);



    }
}
