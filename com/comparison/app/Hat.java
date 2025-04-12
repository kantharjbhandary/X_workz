package com.comparison.app;

import java.util.Objects;

public class Hat {
    private String name;
    private int size;

    public Hat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Hat) {
            Hat hat = this;
            Hat hat1 = (Hat) obj;
            if (hat.name.equals(hat1.name) &&
                hat.size == hat1.size) {
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
