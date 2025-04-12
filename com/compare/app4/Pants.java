package com.compare.app4;



public class Pants {
    private String value;

    public Pants(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Pants) {
            Pants pants = this;
            Pants pants1 = (Pants) obj;
            if (pants.value.equals(pants1.value)) {
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
