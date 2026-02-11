package org.example;

import java.util.Date;

public class SUV extends Car {

    private Traction traction;

    public SUV(String brand, String model, TypeFuel typeFuel, int fabricationYear, Traction traction) {
        super(brand, model, typeFuel, fabricationYear);
        this.traction = traction;
    }

    public Traction getTraction() {
        return traction;
    }

    @Override
    public String carDescription() {
        String template = "El %s %s, con tracción %s, es un SUV que no teme salir del asfalto.Perfecto para aventuras al aire libre, terrenos difíciles y escapadas de fin de semana con potencia y seguridad.";
        return String.format(template, getModel(),getBrand(), getTraction());
    }

}
