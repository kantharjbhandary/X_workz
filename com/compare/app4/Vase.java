package com.compare.app4;



public class Vase {
    private String value;

    public Vase(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Vase) {
            Vase vase = this;
            Vase vase1 = (Vase) obj;
            if (vase.value.equals(vase1.value)) {
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
