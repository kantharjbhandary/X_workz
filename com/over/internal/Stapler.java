package com.over.internal;

public class Stapler {
    private String model;
    private String size;
    private String brand;

    public Stapler(String model, String size, String brand) {
        this.model = model;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "size : " + size + ", " + "brand : " + brand;
    }
}
