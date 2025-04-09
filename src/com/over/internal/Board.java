package com.over.internal;

public class Board {
    private int quantity;
    private String model;
    private String color;

    public Board(int quantity, String model, String color) {
        this.quantity = quantity;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "model : " + model + ", " + "color : " + color;
    }
}
