package com.comparison.app;



public class Knife {
    private String name;
    private int size;

    public Knife(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Knife) {
            Knife knife = this;
            Knife knife1 = (Knife) obj;
            if (knife.name.equals(knife1.name) &&
                knife.size == knife1.size) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "name : " + name + ", size : " + size;
    }
}
