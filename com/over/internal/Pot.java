package com.over.internal;

public class Pot {
    private String name;
    private int weight;
    private int quantity;

    public Pot(String name, int weight, int quantity) {
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "weight : " + weight + ", " + "quantity : " + quantity;
    }
}
