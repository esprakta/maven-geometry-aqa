package com.example;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Cube [side=" + side + ", volume=" + getVolume() +
                ", surfaceArea=" + getSurfaceArea() + "]";
    }
}