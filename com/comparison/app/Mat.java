package com.comparison.app;

import java.util.Objects;

public class Mat {
    private String name;
    private int size;

    public Mat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Mat) {
            Mat mat = this;
            Mat mat1 = (Mat) obj;
            if (mat.name.equals(mat1.name) &&
                mat.size == mat1.size) {
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
