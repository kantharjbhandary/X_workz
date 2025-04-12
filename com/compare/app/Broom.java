package com.compare.app;

import java.util.Objects;

public class Broom {
    private String size;
    private String brand;
    private int quantity;

    public Broom(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Broom) {
            Broom broom = this;
            Broom broom1 = (Broom)obj;
            if (broom.brand.equals(broom1.brand) &&
                broom.size.equals(broom1.size) &&
                broom.quantity == broom1.quantity) {
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
