package com.over.internal;

public class Phone {
    private int price;
    private String material;
    private String brand;

    public Phone(int price, String material, String brand) {
        this.price = price;
        this.material = material;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "material : " + material + ", " + "brand : " + brand;
    }
}
