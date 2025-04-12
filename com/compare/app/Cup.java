package com.compare.app;

import java.util.Objects;

public class Cup {
    private String size;
    private String brand;
    private int quantity;

    public Cup(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Cup) {
            Cup cup = this;
            Cup cup1 = (Cup)obj;
            if (cup.brand.equals(cup1.brand) &&
                cup.size.equals(cup1.size) &&
                cup.quantity == cup1.quantity) {
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
