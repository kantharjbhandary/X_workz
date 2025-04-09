package com.over.internal;

public class Sponge {
    private int price;
    private String name;
    private String model;

    public Sponge(int price, String name, String model) {
        this.price = price;
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "name : " + name + ", " + "model : " + model;
    }
}
