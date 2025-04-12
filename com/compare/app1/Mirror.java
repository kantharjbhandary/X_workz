package com.compare.app1;

import java.util.Objects;

public class Mirror {
    private String name;
    private int size;

    public Mirror(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Mirror) {
            Mirror mirror = this;
            Mirror mirror1 = (Mirror) obj;
            if (mirror.name.equals(mirror1.name) &&
                mirror.size == mirror1.size) {
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
