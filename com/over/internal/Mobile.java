package com.over.internal;

public class Mobile {
    private String size;
    private String color;
    private int quantity;

    public Mobile(String size, String color, int quantity) {
        this.size = size;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "color : " + color + ", " + "quantity : " + quantity;
    }
}
