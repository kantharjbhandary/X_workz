package com.over.internal;

public class Scissor {
    private String type;
    private int price;
    private String size;

    public Scissor(String type, int price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "price : " + price + ", " + "size : " + size;
    }
}
