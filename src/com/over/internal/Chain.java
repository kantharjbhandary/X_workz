package com.over.internal;

public class Chain {
    private String material;
    private int price;
    private int quantity;

    public Chain(String material, int price, int quantity) {
        this.material = material;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "price : " + price + ", " + "quantity : " + quantity;
    }
}
