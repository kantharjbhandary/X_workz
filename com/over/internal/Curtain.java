package com.over.internal;

public class Curtain {
    private String type;
    private String color;
    private int weight;

    public Curtain(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "color : " + color + ", " + "weight : " + weight;
    }
}
