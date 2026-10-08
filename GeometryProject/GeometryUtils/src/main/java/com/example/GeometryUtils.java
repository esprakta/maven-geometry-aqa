package com.example;

public class GeometryUtils {

    public static double cmToMeters(double cm) {
        return cm / 100;
    }

    public static double metersToCm(double meters) {
        return meters * 100;
    }

    public static String compareAreas(double area1, double area2) {
        if (area1 > area2) {
            return "First figure is larger";
        } else if (area1 < area2) {
            return "Second figure is larger";
        } else {
            return "Figures have equal area";
        }
    }
}