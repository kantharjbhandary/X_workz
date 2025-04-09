package com.over.internal;

public class Television {
    private String type;
    private int quantity;
    private String size;

    public Television(String type, int quantity, String size) {
        this.type = type;
        this.quantity = quantity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "quantity : " + quantity + ", " + "size : " + size;
    }
}
