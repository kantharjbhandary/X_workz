package com.compare.app4;



public class Scissor {
    private String value;

    public Scissor(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Scissor) {
            Scissor scissor = this;
            Scissor scissor1 = (Scissor) obj;
            if (scissor.value.equals(scissor1.value)) {
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
