package com.comparison.app;

import java.util.Objects;

public class Mouse {
    private String name;
    private int size;

    public Mouse(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Mouse) {
            Mouse mouse = this;
            Mouse mouse1 = (Mouse) obj;
            if (mouse.name.equals(mouse1.name) &&
                mouse.size == mouse1.size) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "name : " + name + ", size : " + size;
    }
}
