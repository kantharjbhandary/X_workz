package com.comparison.app;

public class Cushion {
    private String name;
    private int size;
    private String color;

    public Cushion(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("References are not null");
            if (obj instanceof Cushion) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "name : " + name + ", size : " + size + ", color : " + color;
    }
}
