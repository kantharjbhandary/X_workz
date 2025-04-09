package com.over.internal;

public class Notebook {
    private String type;
    private String color;
    private int price;

    public Notebook(String type, String color, int price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "color : " + color + ", " + "price : " + price;
    }
}
