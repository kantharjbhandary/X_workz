package com.over.internal;

public class Glove {
    private int weight;
    private String type;
    private String brand;

    public Glove(int weight, String type, String brand) {
        this.weight = weight;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "type : " + type + ", " + "brand : " + brand;
    }
}
