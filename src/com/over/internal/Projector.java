package com.over.internal;

public class Projector {
    private String type;
    private String material;
    private String size;

    public Projector(String type, String material, String size) {
        this.type = type;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "material : " + material + ", " + "size : " + size;
    }
}
