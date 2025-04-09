package com.over.internal;

public class Mirror {
    private int weight;
    private String model;
    private String color;

    public Mirror(int weight, String model, String color) {
        this.weight = weight;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "model : " + model + ", " + "color : " + color;
    }
}
