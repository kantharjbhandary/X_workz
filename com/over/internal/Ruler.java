package com.over.internal;

public class Ruler {
    private String name;
    private int price;
    private int weight;

    public Ruler(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "price : " + price + ", " + "weight : " + weight;
    }
}
