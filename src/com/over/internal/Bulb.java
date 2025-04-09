package com.over.internal;

public class Bulb {
    private int weight;
    private int quantity;
    private String type;

    public Bulb(int weight, int quantity, String type) {
        this.weight = weight;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "quantity : " + quantity + ", " + "type : " + type;
    }
}
