package com.over.internal;

public class Socks {
    private String name;
    private String material;
    private int price;

    public Socks(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "material : " + material + ", " + "price : " + price;
    }
}
