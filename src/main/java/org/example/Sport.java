package org.example;

import java.util.Date;

public class Sport extends Car implements Exportable {

    private double maxVelocity;

    public Sport(String brand, String model, TypeFuel typeFuel, int fabricationYear, double maxVelocity) {
        super(brand, model, typeFuel, fabricationYear);
        this.maxVelocity = maxVelocity;
    }

    public double getMaxVelocity() {
        return maxVelocity;
    }


    @Override
    public String carDescription() {
        String template = "Diseñado para quienes viven la carretera intensamente: el %s %s alcanza una velocidad máxima de %s km/h combinando elegancia y rendimiento en cada curva.";
        return String.format(template, getModel(),getBrand(),getMaxVelocity());
    }

    @Override
    public String getExportInfo() {
        return "Export document for Sports car";
    }
}
