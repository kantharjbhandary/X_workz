package com.over.internal;

public class Heater {
    private int price;
    private String name;
    private String color;

    public Heater(int price, String name, String color) {
        this.price = price;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "name : " + name + ", " + "color : " + color;
    }
}
