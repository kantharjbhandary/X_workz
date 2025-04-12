package com.comparison.app;

import java.util.Objects;

public class Bulb {
    private String size;
    private String brand;
    private int quantity;

    public Bulb(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Bulb) {
            Bulb bulb = this;
            Bulb bulb1 = (Bulb) obj;
            if (bulb.brand.equals(bulb1.brand) &&
                bulb.size.equals(bulb1.size) &&
                bulb.quantity == bulb1.quantity) {
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
