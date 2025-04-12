package com.compare.app4;



public class Television {
    private String value;

    public Television(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Television) {
            Television television = this;
            Television television1 = (Television) obj;
            if (television.value.equals(television1.value)) {
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
