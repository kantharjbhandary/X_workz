package com.over.internal;

public class Canvas {
    private String type;
    private String brand;
    private int weight;

    public Canvas(String type, String brand, int weight) {
        this.type = type;
        this.brand = brand;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "brand : " + brand + ", " + "weight : " + weight;
    }
}
