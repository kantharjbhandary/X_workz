package com.over.internal;

public class Cup {
    private int price;
    private String size;
    private String brand;

    public Cup(int price, String size, String brand) {
        this.price = price;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "size : " + size + ", " + "brand : " + brand;
    }
}
