package com.over.internal;

public class Table {
    private int quantity;
    private String model;
    private String size;

    public Table(int quantity, String model, String size) {
        this.quantity = quantity;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "model : " + model + ", " + "size : " + size;
    }
}
