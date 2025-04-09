package com.over.internal;

public class Socket {
    private String name;
    private String brand;
    private String type;

    public Socket(String name, String brand, String type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "name : " + name + ", " + "brand : " + brand + ", " + "type : " + type;
    }
}
