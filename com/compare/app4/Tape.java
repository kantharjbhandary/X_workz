package com.compare.app4;



public class Tape {
    private String value;

    public Tape(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Tape) {
            Tape tape = this;
            Tape tape1 = (Tape) obj;
            if (tape.value.equals(tape1.value)) {
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
