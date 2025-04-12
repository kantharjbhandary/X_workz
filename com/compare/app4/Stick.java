package com.compare.app4;



public class Stick {
    private String value;

    public Stick(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Stick) {
            Stick stick = this;
            Stick stick1 = (Stick) obj;
            if (stick.value.equals(stick1.value)) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "value : " + value;
    }
}
