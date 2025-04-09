package com.over.internal;

public class Bag {
    private String size;
    private String brand;
    private int quantity;

    public Bag(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "brand : " + brand + ", " + "quantity : " + quantity;
    }
}
