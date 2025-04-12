package com.compare.app1;

import java.util.Objects;

public class Jacket {
    private String name;
    private int size;

    public Jacket(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Jacket) {
            Jacket jacket = this;
            Jacket jacket1 = (Jacket) obj;
            if (jacket.name.equals(jacket1.name) &&
                jacket.size == jacket1.size) {
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
