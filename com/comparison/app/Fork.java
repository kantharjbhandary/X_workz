package com.comparison.app;



public class Fork {
    private String name;
    private int size;

    public Fork(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Fork) {
            Fork fork = this;
            Fork fork1 = (Fork) obj;
            if (fork.name.equals(fork1.name) &&
                fork.size == fork1.size) {
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
