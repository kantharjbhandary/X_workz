package com.over.internal;

public class Helmet {
    private String type;
    private String material;
    private int weight;

    public Helmet(String type, String material, int weight) {
        this.type = type;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "material : " + material + ", " + "weight : " + weight;
    }
}
