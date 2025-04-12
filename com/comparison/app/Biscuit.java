package com.comparison.app;

import java.util.Objects;

public class Biscuit {
    private String size;
    private String brand;
    private int quantity;

    public Biscuit(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Biscuit) {
            Biscuit biscuit = this;
            Biscuit biscuit1 = (Biscuit) obj;
            if (biscuit.brand.equals(biscuit1.brand) &&
                biscuit.size.equals(biscuit1.size) &&
                biscuit.quantity == biscuit1.quantity) {
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
