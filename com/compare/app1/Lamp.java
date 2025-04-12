package com.compare.app1;

import java.util.Objects;

public class Lamp {
    private String name;
    private int size;

    public Lamp(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Lamp) {
            Lamp lamp = this;
            Lamp lamp1 = (Lamp) obj;
            if (lamp.name.equals(lamp1.name) &&
                lamp.size == lamp1.size) {
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
