package com.compare.app1;

import java.util.Objects;

public class Folder {
    private String name;
    private int size;

    public Folder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Folder) {
            Folder folder = this;
            Folder folder1 = (Folder) obj;
            if (folder.name.equals(folder1.name) &&
                folder.size == folder1.size) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }

    @Override
    public String toString() {
        return "name : " + name + ", size : " + size;
    }
}
