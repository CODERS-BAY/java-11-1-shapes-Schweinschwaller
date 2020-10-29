package com.codersbay.gerhofer;

import java.awt.*;

public class Circle extends Shape {

    private double radius;

    public Circle(Color color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        if (this.radius <= 0.0) {
            throw new IllegalArgumentException("radius is negativ.");
        }
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        if (this.radius <= 0.0) {
            throw new IllegalArgumentException("radius is negativ.");
        }
        return this.radius * 2 * Math.PI;
    }
}