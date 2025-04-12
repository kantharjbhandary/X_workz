package com.compare.app;

import java.util.Objects;

public class Camera {
    private String size;
    private String brand;
    private int quantity;

    public Camera(String size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("reference is not null");
        }
        if (obj instanceof Camera) {
            Camera camera = this;
            Camera camera1 = (Camera)obj;
            if (camera.brand.equals(camera1.brand) &&
                camera.size.equals(camera1.size) &&
                camera.quantity == camera1.quantity) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, brand, quantity);
    }

    @Override
    public String toString() {
        return "size : " + size + ", brand : " + brand + ", quantity : " + quantity;
    }
}
