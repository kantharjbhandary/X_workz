package com.compare.app1;

import java.util.Objects;

public class Frame {
    private String name;
    private int size;

    public Frame(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Frame) {
            Frame frame = this;
            Frame frame1 = (Frame) obj;
            if (frame.name.equals(frame1.name) &&
                frame.size == frame1.size) {
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
