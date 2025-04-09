package com.over.internal;

public class Watch {
    private int weight;
    private String model;
    private String brand;

    public Watch(int weight, String model, String brand) {
        this.weight = weight;
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "model : " + model + ", " + "brand : " + brand;
    }
}
