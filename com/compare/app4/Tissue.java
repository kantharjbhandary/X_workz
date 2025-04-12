package com.compare.app4;



public class Tissue {
    private String value;

    public Tissue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Tissue) {
            Tissue tissue = this;
            Tissue tissue1 = (Tissue) obj;
            if (tissue.value.equals(tissue1.value)) {
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
