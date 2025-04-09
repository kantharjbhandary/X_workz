package com.over.internal;

public class Tape {
    private String size;
    private String name;
    private String model;

    public Tape(String size, String name, String model) {
        this.size = size;
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "name : " + name + ", " + "model : " + model;
    }
}
