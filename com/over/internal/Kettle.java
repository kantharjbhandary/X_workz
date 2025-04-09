package com.over.internal;

public class Kettle {
    private String size;
    private int quantity;
    private String color;

    public Kettle(String size, int quantity, String color) {
        this.size = size;
        this.quantity = quantity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "quantity : " + quantity + ", " + "color : " + color;
    }
}
