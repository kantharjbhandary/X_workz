package com.compare.app4;



public class Printer {
    private String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Printer) {
            Printer printer = this;
            Printer printer1 = (Printer) obj;
            if (printer.value.equals(printer1.value)) {
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
