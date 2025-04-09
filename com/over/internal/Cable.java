package com.over.internal;

public class Cable {
    private String size;
    private int weight;
    private int price;

    public Cable(String size, int weight, int price) {
        this.size = size;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "weight : " + weight + ", " + "price : " + price;
    }
}
