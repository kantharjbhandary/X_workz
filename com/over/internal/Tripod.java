package com.over.internal;

public class Tripod {
    private String size;
    private String color;
    private int price;

    public Tripod(String size, String color, int price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "color : " + color + ", " + "price : " + price;
    }
}
