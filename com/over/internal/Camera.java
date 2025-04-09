package com.over.internal;

public class Camera {
    private int quantity;
    private int weight;
    private int price;

    public Camera(int quantity, int weight, int price) {
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "quantity : " + quantity + ", " + "weight : " + weight + ", " + "price : " + price;
    }
}
