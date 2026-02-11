package org.example;

import java.util.ArrayList;
import java.util.List;

//1. **Listar todos los coches registrados**, para mostrar su información relevante.
//2. **Filtrar los coches fabricados después de un año específico**, proporcionado como parámetro.
//3. **Filtrar los coches por tipo y combustible**, devolviendo únicamente aquellos que coincidan con:
//    - Un **tipo de coche** concreto (Sedán, SUV o Deportivo).
//    - Un **tipo de combustible** concreto (gasolina, diésel o eléctrico).

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

    public <T extends Car> List<T> filterByTypeAndFuel(List<Car> cars, Class<T> type, TypeFuel fuel) {
        return cars.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .filter(car -> car.getTypeFuel() == fuel)
                .toList();
    }

}
