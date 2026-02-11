package org.example;

import java.util.Date;

public class Sedan extends Car {

    private double trunkCapacity;

    public Sedan(String brand, String model, TypeFuel typeFuel, int fabricationYear, double trunkCapacity) {
        super(brand, model, typeFuel, fabricationYear);
        this.trunkCapacity = trunkCapacity;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public String carDescription() {
        String template = "Con su espacioso maletero de %s litros y un diseño pensado para el confoert el %s %s es el compañero ideal para viajes familiares y trayectos diarios con estilo.";
        return String.format(template, getTrunkCapacity(), getBrand(), getModel());
    }
}
