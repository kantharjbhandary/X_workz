package com.over.internal;

public class Drone {
    private String type;
    private String brand;
    private String model;

    public Drone(String type, String brand, String model) {
        this.type = type;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "brand : " + brand + ", " + "model : " + model;
    }
}
