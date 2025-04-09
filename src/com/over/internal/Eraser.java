package com.over.internal;

public class Eraser {
    private int price;
    private String model;
    private String type;

    public Eraser(int price, String model, String type) {
        this.price = price;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "model : " + model + ", " + "type : " + type;
    }
}
