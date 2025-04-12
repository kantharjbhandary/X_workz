package com.compare.app;

import java.util.Objects;

public class Comb {
    private String size;
    private String brand;
    private int quantity;

    public Comb(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Comb) {
            Comb comb = this;
            Comb comb1 = (Comb)obj;
            if (comb.brand.equals(comb1.brand) &&
                comb.size.equals(comb1.size) &&
                comb.quantity == comb1.quantity) {
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
