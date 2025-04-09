package com.over.internal;

public class Tissue {
    private String color;
    private int weight;
    private String brand;

    public Tissue(String color, int weight, String brand) {
        this.color = color;
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "weight : " + weight + ", " + "brand : " + brand;
    }
}
