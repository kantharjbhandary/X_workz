package com.over.internal;

public class Crayon {
    private String type;
    private String model;
    private String name;

    public Crayon(String type, String model, String name) {
        this.type = type;
        this.model = model;
        this.name = name;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "model : " + model + ", " + "name : " + name;
    }
}
