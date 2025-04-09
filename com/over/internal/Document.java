package com.over.internal;

public class Document {
    private int price;
    private String model;
    private int quantity;

    public Document(int price, String model, int quantity) {
        this.price = price;
        this.model = model;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "model : " + model + ", " + "quantity : " + quantity;
    }
}
