package com.compare.app4;



public class Sharpener {
    private String value;

    public Sharpener(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Sharpener) {
            Sharpener sharpener = this;
            Sharpener sharpener1 = (Sharpener) obj;
            if (sharpener.value.equals(sharpener1.value)) {
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
