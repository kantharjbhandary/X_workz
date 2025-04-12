package com.compare.app;

import java.util.Objects;

public class Carpet {
    private String size;
    private String brand;
    private int quantity;

    public Carpet(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Carpet) {
            Carpet carpet = this;
            Carpet carpet1 = (Carpet)obj;
            if (carpet.brand.equals(carpet1.brand) &&
                carpet.size.equals(carpet1.size) &&
                carpet.quantity == carpet1.quantity) {
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
