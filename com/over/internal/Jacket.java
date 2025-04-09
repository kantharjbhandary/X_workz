package com.over.internal;

public class Jacket {
    private String name;
    private int weight;
    private String model;

    public Jacket(String name, int weight, String model) {
        this.name = name;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "weight : " + weight + ", " + "model : " + model;
    }
}
