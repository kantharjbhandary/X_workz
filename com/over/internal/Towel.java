package com.over.internal;

public class Towel {
    private int weight;
    private String type;
    private int price;

    public Towel(int weight, String type, int price) {
        this.weight = weight;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "type : " + type + ", " + "price : " + price;
    }
}
