package com.compare.app1;

import java.util.Objects;

public class Glove {
    private String name;
    private int size;

    public Glove(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Glove) {
            Glove glove = this;
            Glove glove1 = (Glove) obj;
            if (glove.name.equals(glove1.name) &&
                glove.size == glove1.size) {
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
