package com.over.internal;

public class Rope {
    private String size;
    private String brand;
    private String name;

    public Rope(String size, String brand, String name) {
        this.size = size;
        this.brand = brand;
        this.name = name;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "brand : " + brand + ", " + "name : " + name;
    }
}
