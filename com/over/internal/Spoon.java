package com.over.internal;

public class Spoon {
    private int price;
    private String name;
    private String brand;

    public Spoon(int price, String name, String brand) {
        this.price = price;
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "name : " + name + ", " + "brand : " + brand;
    }
}
