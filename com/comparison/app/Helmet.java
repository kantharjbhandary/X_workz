package com.comparison.app;



public class Helmet {
    private String name;
    private int size;

    public Helmet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Helmet) {
            Helmet helmet = this;
            Helmet helmet1 = (Helmet) obj;
            if (helmet.name.equals(helmet1.name) &&
                helmet.size == helmet1.size) {
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
