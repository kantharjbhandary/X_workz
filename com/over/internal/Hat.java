package com.over.internal;

public class Hat {
    private int weight;
    private String brand;
    private String material;

    public Hat(int weight, String brand, String material) {
        this.weight = weight;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "brand : " + brand + ", " + "material : " + material;
    }
}
