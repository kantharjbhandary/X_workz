package com.compare.app4;



public class Plate {
    private String value;

    public Plate(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Plate) {
            Plate plate = this;
            Plate plate1 = (Plate) obj;
            if (plate.value.equals(plate1.value)) {
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
