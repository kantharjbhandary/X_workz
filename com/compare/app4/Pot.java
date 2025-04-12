package com.compare.app4;



public class Pot {
    private String value;

    public Pot(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Pot) {
            Pot pot = this;
            Pot pot1 = (Pot) obj;
            if (pot.value.equals(pot1.value)) {
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
