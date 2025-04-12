package com.comparison.app;

import java.util.Objects;

public class Mobile {
    private String name;
    private int size;

    public Mobile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Mobile) {
            Mobile mobile = this;
            Mobile mobile1 = (Mobile) obj;
            if (mobile.name.equals(mobile1.name) &&
                mobile.size == mobile1.size) {
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
