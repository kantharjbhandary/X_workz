package com.over.internal;

public class Lamp {
    private String material;
    private String name;
    private int weight;

    public Lamp(String material, String name, int weight) {
        this.material = material;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "name : " + name + ", " + "weight : " + weight;
    }
}
