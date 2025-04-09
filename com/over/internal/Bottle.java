package com.over.internal;

public class Bottle {
    private String model;
    private String color;
    private String name;

    public Bottle(String model, String color, String name) {
        this.model = model;
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "color : " + color + ", " + "name : " + name;
    }
}
