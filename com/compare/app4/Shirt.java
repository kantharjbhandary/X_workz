package com.compare.app4;



public class Shirt {
    private String value;

    public Shirt(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Shirt) {
            Shirt shirt = this;
            Shirt shirt1 = (Shirt) obj;
            if (shirt.value.equals(shirt1.value)) {
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
