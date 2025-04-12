package com.compare.app4;



public class Pencil {
    private String grade;

    public Pencil(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Pencil) {
            Pencil pencil = this;
            Pencil pencil1 = (Pencil) obj;
            if (pencil.grade.equals(pencil1.grade)) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "grade : " + grade;
    }
}
