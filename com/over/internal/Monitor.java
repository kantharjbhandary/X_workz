package com.over.internal;

public class Monitor {
    private int quantity;
    private String material;
    private String size;

    public Monitor(int quantity, String material, String size) {
        this.quantity = quantity;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "material : " + material + ", " + "size : " + size;
    }
}
