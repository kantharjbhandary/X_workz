package com.over.internal;

public class Ball {
    private String name;
    private String size;
    private String color;

    public Ball(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "size : " + size + ", " + "color : " + color;
    }
}
