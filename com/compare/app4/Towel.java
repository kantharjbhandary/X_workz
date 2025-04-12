package com.compare.app4;



public class Towel {
    private String value;

    public Towel(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Towel) {
            Towel towel = this;
            Towel towel1 = (Towel) obj;
            if (towel.value.equals(towel1.value)) {
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
