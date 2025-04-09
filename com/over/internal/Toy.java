package com.over.internal;

public class Toy {
    private int quantity;
    private String material;
    private String model;

    public Toy(int quantity, String material, String model) {
        this.quantity = quantity;
        this.material = material;
        this.model = model;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "material : " + material + ", " + "model : " + model;
    }
}
