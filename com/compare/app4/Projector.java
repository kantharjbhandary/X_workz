package com.compare.app4;



public class Projector {
    private String value;

    public Projector(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Projector) {
            Projector projector = this;
            Projector projector1 = (Projector) obj;
            if (projector.value.equals(projector1.value)) {
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
