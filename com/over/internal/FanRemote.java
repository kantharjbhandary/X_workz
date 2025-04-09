package com.over.internal;

public class FanRemote {
    private int price;
    private String color;
    private int quantity;

    public FanRemote(int price, String color, int quantity) {
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "color : " + color + ", " + "quantity : " + quantity;
    }
}
