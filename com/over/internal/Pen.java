package com.over.internal;

public class Pen {
    private String model;
    private String size;
    private String material;

    public Pen(String model, String size, String material) {
        this.model = model;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "size : " + size + ", " + "material : " + material;
    }
}
