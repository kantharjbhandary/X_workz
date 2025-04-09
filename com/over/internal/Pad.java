package com.over.internal;

public class Pad {
    private String color;
    private String model;
    private int price;

    public Pad(String color, String model, int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "model : " + model + ", " + "price : " + price;
    }
}
