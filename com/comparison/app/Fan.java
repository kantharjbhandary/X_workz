package com.comparison.app;

import java.util.Objects;

public class Fan {
    private String name;
    private int size;

    public Fan(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Fan) {
            Fan fan = this;
            Fan fan1 = (Fan) obj;
            if (fan.name.equals(fan1.name) &&
                fan.size == fan1.size) {
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
