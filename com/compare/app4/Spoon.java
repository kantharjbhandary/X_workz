package com.compare.app4;



public class Spoon {
    private String value;

    public Spoon(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Spoon) {
            Spoon spoon = this;
            Spoon spoon1 = (Spoon) obj;
            if (spoon.value.equals(spoon1.value)) {
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
