package com.over.internal;

public class Laptop {
    private String material;
    private String brand;
    private String name;

    public Laptop(String material, String brand, String name) {
        this.material = material;
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "brand : " + brand + ", " + "name : " + name;
    }
}
