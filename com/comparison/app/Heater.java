package com.comparison.app;

import java.util.Objects;

public class Heater {
    private String name;
    private int size;

    public Heater(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Heater) {
            Heater heater = this;
            Heater heater1 = (Heater) obj;
            if (heater.name.equals(heater1.name) &&
                heater.size == heater1.size) {
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
