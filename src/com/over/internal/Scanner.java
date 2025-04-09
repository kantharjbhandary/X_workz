package com.over.internal;

public class Scanner {
    private String color;
    private String material;
    private int weight;

    public Scanner(String color, String material, int weight) {
        this.color = color;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "material : " + material + ", " + "weight : " + weight;
    }
}
