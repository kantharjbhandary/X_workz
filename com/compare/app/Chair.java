package com.compare.app;

import java.util.Objects;

public class Chair {
    private String size;
    private String brand;
    private int quantity;

    public Chair(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Chair) {
            Chair chair = this;
            Chair chair1 = (Chair)obj;
            if (chair.brand.equals(chair1.brand) &&
                chair.size.equals(chair1.size) &&
                chair.quantity == chair1.quantity) {
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
