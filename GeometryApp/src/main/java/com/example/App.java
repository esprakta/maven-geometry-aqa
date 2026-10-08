package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("\n--- 2D Фигуры ---\n");

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Диаметр круга: " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);

        System.out.println("\n--- 3D Фигуры ---\n");

        Cube cube = new Cube(3);
        System.out.println(cube);

        Sphere sphere = new Sphere(5);
        System.out.println(sphere);

        System.out.println("\n--- Утилиты ---\n");

        System.out.println("100 см = " + GeometryUtils.cmToMeters(100) + " метров");
        System.out.println("250 см = " + GeometryUtils.cmToMeters(250) + " метров");
        System.out.println("1 метр = " + GeometryUtils.metersToCm(1) + " см");

        String comparison = GeometryUtils.compareAreas(circle.getArea(), rectangle.getArea());
        System.out.println("Сравнение площадей круга и прямоугольника: " + comparison);

        System.out.println("\nПриложение успешно отработало!");
    }
}