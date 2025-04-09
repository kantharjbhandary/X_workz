package com.over.internal;

public class Envelope {
    private String size;
    private int weight;
    private String model;

    public Envelope(String size, int weight, String model) {
        this.size = size;
        this.weight = weight;
        this.model = model;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "weight : " + weight + ", " + "model : " + model;
    }
}
