package com.over.internal;

public class Comb {
    private int quantity;
    private String name;
    private String model;

    public Comb(int quantity, String name, String model) {
        this.quantity = quantity;
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "name : " + name + ", " + "model : " + model;
    }
}
