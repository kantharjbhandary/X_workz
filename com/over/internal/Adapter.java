package com.over.internal;

public class Adapter {
    private String color;
    private String material;
    private String brand;

    public Adapter(String color, String material, String brand) {
        this.color = color;
        this.material = material;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "material : " + material + ", " + "brand : " + brand;
    }
}
