package com.compare.app;

import java.util.Objects;

public class Ball {
    private String size;
    private String brand;
    private int quantity;

    public Ball(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Ball) {
            Ball ball = this;
            Ball ball1 = (Ball)obj;
            if (ball.brand.equals(ball1.brand) &&
                ball.size.equals(ball1.size) &&
                ball.quantity == ball1.quantity) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, brand, quantity);
    }

    @Override
    public String toString() {
        return "size : " + size + ", brand : " + brand + ", quantity : " + quantity;
    }
}
