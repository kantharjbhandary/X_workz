package com.over.internal;

public class Book {
    private String model;
    private String name;
    private String brand;

    public Book(String model, String name, String brand) {
        this.model = model;
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "name : " + name + ", " + "brand : " + brand;
    }
}
