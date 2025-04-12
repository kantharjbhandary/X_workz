package com.comparison.app;

import java.util.Objects;

public class Canvas {
    private String size;
    private String brand;
    private int quantity;

    public Canvas(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Canvas) {
            Canvas canvas = this;
            Canvas canvas1 = (Canvas) obj;
            if (canvas.brand.equals(canvas1.brand) &&
                canvas.size.equals(canvas1.size) &&
                canvas.quantity == canvas1.quantity) {
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
