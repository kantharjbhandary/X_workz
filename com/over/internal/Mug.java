package com.over.internal;

public class Mug {
    private String name;
    private int quantity;
    private String model;

    public Mug(String name, int quantity, String model) {
        this.name = name;
        this.quantity = quantity;
        this.model = model;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "quantity : " + quantity + ", " + "model : " + model;
    }
}
