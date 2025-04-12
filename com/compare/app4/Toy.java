package com.compare.app4;



public class Toy {
    private String value;

    public Toy(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Toy) {
            Toy toy = this;
            Toy toy1 = (Toy) obj;
            if (toy.value.equals(toy1.value)) {
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
