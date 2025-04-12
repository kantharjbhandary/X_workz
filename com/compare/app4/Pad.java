package com.compare.app4;



public class Pad {
    private int sheets;

    public Pad(int sheets) {
        this.sheets = sheets;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Pad) {
            Pad pad = this;
            Pad pad1 = (Pad) obj;
            if (pad.sheets == pad1.sheets) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "sheets : " + sheets;
    }
}
