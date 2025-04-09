package com.over.internal;

public class Door {
    private int weight;
    private String type;
    private String name;

    public Door(int weight, String type, String name) {
        this.weight = weight;
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "type : " + type + ", " + "name : " + name;
    }
}
