package com.over.internal;

public class Folder {
    private String type;
    private int quantity;
    private String size;

    public Folder(String type, int quantity, String size) {
        this.type = type;
        this.quantity = quantity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "quantity : " + quantity + ", " + "size : " + size;
    }
}
