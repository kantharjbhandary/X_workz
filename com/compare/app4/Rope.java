package com.compare.app4;



public class Rope {
    private String value;

    public Rope(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Rope) {
            Rope rope = this;
            Rope rope1 = (Rope) obj;
            if (rope.value.equals(rope1.value)) {
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
