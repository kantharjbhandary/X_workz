package com.comparison.app;

import java.util.Objects;

public class Clock {
    private String size;
    private String brand;
    private int quantity;

    public Clock(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Clock) {
            Clock clock = this;
            Clock clock1 = (Clock) obj;
            if (clock.brand.equals(clock1.brand) &&
                clock.size.equals(clock1.size) &&
                clock.quantity == clock1.quantity) {
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
