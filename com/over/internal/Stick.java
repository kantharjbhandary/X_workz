package com.over.internal;

public class Stick {
    private int weight;
    private String material;
    private String size;

    public Stick(int weight, String material, String size) {
        this.weight = weight;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "material : " + material + ", " + "size : " + size;
    }
}
