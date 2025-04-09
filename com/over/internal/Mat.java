package com.over.internal;

public class Mat {
    private String name;
    private String material;
    private String brand;

    public Mat(String name, String material, String brand) {
        this.name = name;
        this.material = material;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "material : " + material + ", " + "brand : " + brand;
    }
}
