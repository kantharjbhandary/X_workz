package com.compare.app;

import java.util.Objects;

public class Door {
    private String size;
    private String brand;
    private int quantity;

    public Door(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Door) {
            Door door = this;
            Door door1 = (Door)obj;
            if (door.brand.equals(door1.brand) &&
                door.size.equals(door1.size) &&
                door.quantity == door1.quantity) {
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
