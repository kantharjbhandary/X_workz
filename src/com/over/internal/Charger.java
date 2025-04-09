package com.over.internal;

public class Charger {
    private int quantity;
    private String brand;
    private int price;

    public Charger(int quantity, String brand, int price) {
        this.quantity = quantity;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "brand : " + brand + ", " + "price : " + price;
    }
}
