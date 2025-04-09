package com.over.internal;

public class Speaker {
    private String color;
    private String model;
    private int weight;

    public Speaker(String color, String model, int weight) {
        this.color = color;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "model : " + model + ", " + "weight : " + weight;
    }
}
