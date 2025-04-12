package com.compare.app4;



public class Shoe {
    private String value;

    public Shoe(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Shoe) {
            Shoe shoe = this;
            Shoe shoe1 = (Shoe) obj;
            if (shoe.value.equals(shoe1.value)) {
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
