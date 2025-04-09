package com.over.internal;

public class Plug {
    private String brand;
    private int weight;
    private String color;

    public Plug(String brand, int weight, String color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "weight : " + weight + ", " + "color : " + color;
    }
}
