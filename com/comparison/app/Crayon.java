package com.comparison.app;

import java.util.Objects;

public class Crayon {
    private String size;
    private String brand;
    private int quantity;

    public Crayon(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Crayon) {
            Crayon crayon = this;
            Crayon crayon1 = (Crayon) obj;
            if (crayon.brand.equals(crayon1.brand) &&
                crayon.size.equals(crayon1.size) &&
                crayon.quantity == crayon1.quantity) {
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
