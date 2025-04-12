package com.compare.app;

import java.util.Objects;

public class Cable {
    private String size;
    private String brand;
    private int quantity;

    public Cable(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Cable) {
            Cable cable = this;
            Cable cable1 = (Cable)obj;
            if (cable.brand.equals(cable1.brand) &&
                cable.size.equals(cable1.size) &&
                cable.quantity == cable1.quantity) {
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
