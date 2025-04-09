package com.over.internal;

public class Pants {
    private String model;
    private int quantity;
    private String name;

    public Pants(String model, int quantity, String name) {
        this.model = model;
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "quantity : " + quantity + ", " + "name : " + name;
    }
}
