package com.over.internal;

public class Fork {
    private String brand;
    private String color;
    private String material;

    public Fork(String brand, String color, String material) {
        this.brand = brand;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "color : " + color + ", " + "material : " + material;
    }
}
