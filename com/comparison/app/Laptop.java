package com.comparison.app;



public class Laptop {
    private String name;
    private int size;

    public Laptop(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Laptop) {
            Laptop laptop = this;
            Laptop laptop1 = (Laptop) obj;
            if (laptop.name.equals(laptop1.name) &&
                laptop.size == laptop1.size) {
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
