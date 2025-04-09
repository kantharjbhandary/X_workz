package com.over.internal;

public class Knife {
    private String size;
    private int price;
    private String brand;

    public Knife(String size, int price, String brand) {
        this.size = size;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "price : " + price + ", " + "brand : " + brand;
    }
}
