package com.compare.app4;



public class Stapler {
    private String value;

    public Stapler(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Stapler) {
            Stapler stapler = this;
            Stapler stapler1 = (Stapler) obj;
            if (stapler.value.equals(stapler1.value)) {
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
