package com.over.internal;

public class Brush {
    private String color;
    private int quantity;
    private int weight;

    public Brush(String color, int quantity, int weight) {
        this.color = color;
        this.quantity = quantity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "quantity : " + quantity + ", " + "weight : " + weight;
    }
}
