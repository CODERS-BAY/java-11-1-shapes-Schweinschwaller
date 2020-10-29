package com.codersbay.gerhofer;

import java.awt.*;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(Color color, boolean isFilled, double length, double width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        if (this.length <= 0.0 || this.width <= 0.0) {
            throw new IllegalArgumentException("length is negativ.");
        }
        return length * this.width;
    }

    public double getPerimeter() {
        if (this.length <= 0.0 || this.width <= 0.0) {
            throw new IllegalArgumentException("length is negativ.");
        }
        return length * 2 + this.width * 2;
    }
}
