package com.over.internal;

public class Window {
    private String name;
    private String type;
    private String model;

    public Window(String name, String type, String model) {
        this.name = name;
        this.type = type;
        this.model = model;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "type : " + type + ", " + "model : " + model;
    }
}
