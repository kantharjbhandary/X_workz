package com.over.internal;

public class Bat {
    private String model;
    private String material;
    private String type;

    public Bat(String model, String material, String type) {
        this.model = model;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "material : " + material + ", " + "type : " + type;
    }
}
