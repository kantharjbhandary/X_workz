package com.comparison.app;

import java.util.Objects;

public class Bat {
    private String size;
    private String brand;
    private int quantity;

    public Bat(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Bat) {
            Bat bat = this;
            Bat bat1 = (Bat) obj;
            if (bat.brand.equals(bat1.brand) &&
                bat.size.equals(bat1.size) &&
                bat.quantity == bat1.quantity) {
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
