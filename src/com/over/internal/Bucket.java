package com.over.internal;

public class Bucket {
    private String brand;
    private String name;
    private String type;

    public Bucket(String brand, String name, String type) {
        this.brand = brand;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "name : " + name + ", " + "type : " + type;
    }
}
