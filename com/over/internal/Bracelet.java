package com.over.internal;

public class Bracelet {
    private String model;
    private String size;
    private int quantity;

    public Bracelet(String model, String size, int quantity) {
        this.model = model;
        this.size = size;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "size : " + size + ", " + "quantity : " + quantity;
    }
}
