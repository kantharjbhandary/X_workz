package com.compare.app;

import java.util.Objects;

public class Bag {
    private String size;
    private String brand;
    private int quantity;

    public Bag(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Bag) {
            Bag bag = this;
            Bag bag1 = (Bag)obj;
            if (bag.brand.equals(bag1.brand) &&
                bag.size.equals(bag1.size) &&
                bag.quantity == bag1.quantity) {
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
