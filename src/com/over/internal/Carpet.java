package com.over.internal;

public class Carpet {
    private String size;
    private String model;
    private String color;

    public Carpet(String size, String model, String color) {
        this.size = size;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "model : " + model + ", " + "color : " + color;
    }
}
