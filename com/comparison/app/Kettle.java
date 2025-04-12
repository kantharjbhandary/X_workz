package com.comparison.app;

import java.util.Objects;

public class Kettle {
    private String name;
    private int size;

    public Kettle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Kettle) {
            Kettle kettle = this;
            Kettle kettle1 = (Kettle) obj;
            if (kettle.name.equals(kettle1.name) &&
                kettle.size == kettle1.size) {
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
