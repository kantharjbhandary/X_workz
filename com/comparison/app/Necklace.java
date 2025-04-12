package com.comparison.app;

import java.util.Objects;

public class Necklace {
    private String name;
    private int size;

    public Necklace(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Necklace) {
            Necklace necklace = this;
            Necklace necklace1 = (Necklace) obj;
            if (necklace.name.equals(necklace1.name) &&
                necklace.size == necklace1.size) {
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
