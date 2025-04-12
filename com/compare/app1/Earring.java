package com.compare.app1;

import java.util.Objects;

public class Earring {
    private String name;
    private int size;

    public Earring(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Earring) {
            Earring earring = this;
            Earring earring1 = (Earring) obj;
            if (earring.name.equals(earring1.name) &&
                earring.size == earring1.size) {
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
