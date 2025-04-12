package com.comparison.app;

import java.util.Objects;

public class Monitor {
    private String name;
    private int size;

    public Monitor(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Monitor) {
            Monitor monitor = this;
            Monitor monitor1 = (Monitor) obj;
            if (monitor.name.equals(monitor1.name) &&
                monitor.size == monitor1.size) {
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
