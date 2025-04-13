package com.compare.app4;



public class Notebook {
    private int pages;

    public Notebook(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Notebook) {
            Notebook notebo = this;
            Notebook notebook1 = (Notebook) obj;
            if (notebo.pages == notebook1.pages) {
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return "pages : " + pages;
    }
}
