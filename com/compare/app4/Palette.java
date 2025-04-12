package com.compare.app4;



public class Palette {
    private String value;

    public Palette(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Palette) {
            Palette palette = this;
            Palette palette1 = (Palette) obj;
            if (palette.value.equals(palette1.value)) {
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
