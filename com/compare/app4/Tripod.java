package com.compare.app4;



public class Tripod {
    private String value;

    public Tripod(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Tripod) {
            Tripod tripod = this;
            Tripod tripod1 = (Tripod) obj;
            if (tripod.value.equals(tripod1.value)) {
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
