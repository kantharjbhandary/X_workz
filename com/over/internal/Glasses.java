package com.over.internal;

public class Glasses {
    private int quantity;
    private String brand;
    private String material;

    public Glasses(int quantity, String brand, String material) {
        this.quantity = quantity;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "brand : " + brand + ", " + "material : " + material;
    }
}
