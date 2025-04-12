package com.comparison.app;

import java.util.Objects;

public class FanRemote {
    private String name;
    private int size;

    public FanRemote(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof FanRemote) {
            FanRemote fanremote = this;
            FanRemote fanremote1 = (FanRemote) obj;
            if (fanremote.name.equals(fanremote1.name) &&
                fanremote.size == fanremote1.size) {
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
