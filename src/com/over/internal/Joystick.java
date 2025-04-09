package com.over.internal;

public class Joystick {
    private int quantity;
    private String type;
    private int weight;

    public Joystick(int quantity, String type, int weight) {
        this.quantity = quantity;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "type : " + type + ", " + "weight : " + weight;
    }
}
