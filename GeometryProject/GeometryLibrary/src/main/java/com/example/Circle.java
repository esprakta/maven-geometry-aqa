package com.example;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", diameter=" + getDiameter() + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}

