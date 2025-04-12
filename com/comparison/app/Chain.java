package com.comparison.app;

import java.util.Objects;

public class Chain {
    private String size;
    private String brand;
    private int quantity;

    public Chain(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Chain) {
            Chain chain = this;
            Chain chain1 = (Chain) obj;
            if (chain.brand.equals(chain1.brand) &&
                chain.size.equals(chain1.size) &&
                chain.quantity == chain1.quantity) {
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
