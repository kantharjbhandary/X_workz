package com.over.internal;

public class Plate {
    private int weight;
    private String brand;
    private String color;

    public Plate(int weight, String brand, String color) {
        this.weight = weight;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "brand : " + brand + ", " + "color : " + color;
    }
}
