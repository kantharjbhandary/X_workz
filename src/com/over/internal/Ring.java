package com.over.internal;

public class Ring {
    private String brand;
    private String color;
    private String name;

    public Ring(String brand, String color, String name) {
        this.brand = brand;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "color : " + color + ", " + "name : " + name;
    }
}
