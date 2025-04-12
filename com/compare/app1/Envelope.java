package com.compare.app1;

import java.util.Objects;

public class Envelope {
    private String name;
    private int size;

    public Envelope(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Envelope) {
            Envelope envelope = this;
            Envelope envelope1 = (Envelope) obj;
            if (envelope.name.equals(envelope1.name) &&
                envelope.size == envelope1.size) {
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
