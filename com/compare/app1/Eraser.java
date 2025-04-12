package com.compare.app1;

import java.util.Objects;

public class Eraser {
    private String name;
    private int size;

    public Eraser(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Eraser) {
            Eraser eraser = this;
            Eraser eraser1 = (Eraser) obj;
            if (eraser.name.equals(eraser1.name) &&
                eraser.size == eraser1.size) {
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
