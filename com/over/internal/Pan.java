package com.over.internal;

public class Pan {
    private String name;
    private String material;
    private String model;

    public Pan(String name, String material, String model) {
        this.name = name;
        this.material = material;
        this.model = model;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "material : " + material + ", " + "model : " + model;
    }
}
