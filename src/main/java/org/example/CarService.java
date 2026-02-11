package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        if (car == null){
            throw new IllegalArgumentException("Car can't be null");
        }
        cars.add(car);
    }

    public void listCars() {
        cars.forEach(cars -> System.out.println(cars.carDescription()));
    }

    public List<Car> filterByYear(int year) {
        return cars.stream()
                .filter(car -> car.getFabricationYear() > year)
                .toList();
    }



    public List<Car> filterByTypeAndFuel(Class< ? extends Car> typeCar, TypeFuel fuel) {
        return cars.stream()
                .filter(cars ->  typeCar.isInstance(cars) && cars.getTypeFuel() == fuel)
                .toList();
    }


}
