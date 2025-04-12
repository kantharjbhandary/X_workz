package com.comparison.app;

import java.util.Objects;

public class Drone {
    private String name;
    private int size;

    public Drone(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Drone) {
            Drone drone = this;
            Drone drone1 = (Drone) obj;
            if (drone.name.equals(drone1.name) &&
                drone.size == drone1.size) {
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
