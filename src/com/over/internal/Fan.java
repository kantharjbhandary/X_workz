package com.over.internal;

public class Fan {
    private int quantity;
    private int weight;
    private String size;

    public Fan(int quantity, int weight, String size) {
        this.quantity = quantity;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "weight : " + weight + ", " + "size : " + size;
    }
}
