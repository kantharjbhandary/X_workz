package com.compare.app4;



public class Sponge {
    private String value;

    public Sponge(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Sponge) {
            Sponge sponge = this;
            Sponge sponge1 = (Sponge) obj;
            if (sponge.value.equals(sponge1.value)) {
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
