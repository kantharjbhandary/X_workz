package com.comparison.app;

import java.util.Objects;

public class Joystick {
    private String name;
    private int size;

    public Joystick(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Joystick) {
            Joystick joystick = this;
            Joystick joystick1 = (Joystick) obj;
            if (joystick.name.equals(joystick1.name) &&
                joystick.size == joystick1.size) {
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
