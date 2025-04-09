package com.over.internal;

public class Biscuit {
    private int quantity;
    private String model;
    private String name;

    public Biscuit(int quantity, String model, String name) {
        this.quantity = quantity;
        this.model = model;
        this.name = name;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "model : " + model + ", " + "name : " + name;
    }
}
