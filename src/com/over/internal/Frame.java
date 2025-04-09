package com.over.internal;

public class Frame {
    private String name;
    private String model;
    private int quantity;

    public Frame(String name, String model, int quantity) {
        this.name = name;
        this.model = model;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "model : " + model + ", " + "quantity : " + quantity;
    }
}
