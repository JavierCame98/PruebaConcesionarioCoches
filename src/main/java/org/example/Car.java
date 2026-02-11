package org.example;

import java.time.Year;

public abstract class Car {

    private String brand;
    private String model;
    private TypeFuel typeFuel;
    private int fabricationYear;

    public Car(String brand, String model, TypeFuel typeFuel, int fabricationYear) {
        if(fabricationYear > Year.now().getValue()){
            throw new IllegalArgumentException("The car can't be fabricated in the future");
        }
        this.brand = brand;
        this.model = model;
        this.typeFuel = typeFuel;
        this.fabricationYear = fabricationYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public abstract String carDescription();

}
