package com.over.internal;

public class Chair {
    private String brand;
    private int quantity;
    private String material;

    public Chair(String brand, int quantity, String material) {
        this.brand = brand;
        this.quantity = quantity;
        this.material = material;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "quantity : " + quantity + ", " + "material : " + material;
    }
}
