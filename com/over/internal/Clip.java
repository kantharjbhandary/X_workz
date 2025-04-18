package com.over.internal;

public class Clip {
    private String model;
    private int price;
    private int weight;

    public Clip(String model, int price, int weight) {
        this.model = model;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "price : " + price + ", " + "weight : " + weight;
    }
}
