package com.over.internal;

public class Shoe {
    private int weight;
    private int price;
    private String model;

    public Shoe(int weight, int price, String model) {
        this.weight = weight;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "price : " + price + ", " + "model : " + model;
    }
}
