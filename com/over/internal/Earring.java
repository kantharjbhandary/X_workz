package com.over.internal;

public class Earring {
    private int price;
    private String type;
    private String size;

    public Earring(int price, String type, String size) {
        this.price = price;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "type : " + type + ", " + "size : " + size;
    }
}
