package com.compare.app4;



public class Ring {
    private String value;

    public Ring(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Ring) {
            Ring ring = this;
            Ring ring1 = (Ring) obj;
            if (ring.value.equals(ring1.value)) {
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
