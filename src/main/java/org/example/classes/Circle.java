package org.example.classes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // actually getArea()
    public double getCircumference() {
        return this.radius * this.radius * Math.PI;
    }

    public double getRadius() {
        return this.radius;
    }
}
