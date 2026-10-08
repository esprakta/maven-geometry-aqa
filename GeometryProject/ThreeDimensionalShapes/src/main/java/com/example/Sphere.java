package com.example;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + ", volume=" + getVolume() +
                ", surfaceArea=" + getSurfaceArea() + "]";
    }
}