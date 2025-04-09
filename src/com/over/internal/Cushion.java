package com.over.internal;

public class Cushion {
    private String type;
    private int price;
    private String name;

    public Cushion(String type, int price, String name) {
        this.type = type;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "price : " + price + ", " + "name : " + name;
    }
}
