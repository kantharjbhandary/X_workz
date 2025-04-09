package com.over.internal;

public class Broom {
    private String size;
    private int weight;
    private int quantity;

    public Broom(String size, int weight, int quantity) {
        this.size = size;
        this.weight = weight;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "weight : " + weight + ", " + "quantity : " + quantity;
    }
}
