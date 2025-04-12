package com.compare.app4;



public class Ruler {
    private String value;

    public Ruler(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Ruler) {
            Ruler ruler = this;
            Ruler ruler1 = (Ruler) obj;
            if (ruler.value.equals(ruler1.value)) {
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
