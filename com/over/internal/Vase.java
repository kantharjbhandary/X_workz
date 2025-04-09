package com.over.internal;

public class Vase {
    private String model;
    private String type;
    private String name;

    public Vase(String model, String type, String name) {
        this.model = model;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "type : " + type + ", " + "name : " + name;
    }
}
