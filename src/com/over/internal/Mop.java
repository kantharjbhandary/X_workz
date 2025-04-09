package com.over.internal;

public class Mop {
    private String color;
    private String type;
    private String brand;

    public Mop(String color, String type, String brand) {
        this.color = color;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "type : " + type + ", " + "brand : " + brand;
    }
}
