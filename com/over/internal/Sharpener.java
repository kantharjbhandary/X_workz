package com.over.internal;

public class Sharpener {
    private String model;
    private String name;
    private int weight;

    public Sharpener(String model, String name, int weight) {
        this.model = model;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "name : " + name + ", " + "weight : " + weight;
    }
}
