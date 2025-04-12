package com.compare.app;

import java.util.Objects;

public class Clip {
    private String size;
    private String brand;
    private int quantity;

    public Clip(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Clip) {
            Clip clip = this;
            Clip clip1 = (Clip)obj;
            if (clip.brand.equals(clip1.brand) &&
                clip.size.equals(clip1.size) &&
                clip.quantity == clip1.quantity) {
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
