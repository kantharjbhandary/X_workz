package com.over.internal;

public class Keyboard {
    private String material;
    private String model;
    private String size;

    public Keyboard(String material, String model, String size) {
        this.material = material;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "model : " + model + ", " + "size : " + size;
    }
}
