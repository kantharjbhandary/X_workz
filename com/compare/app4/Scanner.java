package com.compare.app4;



public class Scanner {
    private String value;

    public Scanner(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Scanner) {
            Scanner scanner = this;
            Scanner scanner1 = (Scanner) obj;
            if (scanner.value.equals(scanner1.value)) {
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
