package com.over.internal;

public class Pencil {
    private String name;
    private String size;
    private String type;

    public Pencil(String name, String size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "size : " + size + ", " + "type : " + type;
    }
}
