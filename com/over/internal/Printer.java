package com.over.internal;

public class Printer {
    private String brand;
    private String model;
    private String size;

    public Printer(String brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "model : " + model + ", " + "size : " + size;
    }
}
