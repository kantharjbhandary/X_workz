package com.over.internal;

public class Palette {
    private int weight;
    private String size;
    private String name;

    public Palette(int weight, String size, String name) {
        this.weight = weight;
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "size : " + size + ", " + "name : " + name;
    }
}
