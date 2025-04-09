package com.over.internal;

public class File {
    private String brand;
    private int quantity;
    private String type;

    public File(String brand, int quantity, String type) {
        this.brand = brand;
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "quantity : " + quantity + ", " + "type : " + type;
    }
}
