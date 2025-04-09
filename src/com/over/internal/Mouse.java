package com.over.internal;

public class Mouse {
    private String name;
    private String model;
    private String size;

    public Mouse(String name, String model, String size) {
        this.name = name;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "model : " + model + ", " + "size : " + size;
    }
}
