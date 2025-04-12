package com.compare.app1;

import java.util.Objects;

public class Glasses {
    private String name;
    private int size;

    public Glasses(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Glasses) {
            Glasses glasses = this;
            Glasses glasses1 = (Glasses) obj;
            if (glasses.name.equals(glasses1.name) &&
                glasses.size == glasses1.size) {
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
