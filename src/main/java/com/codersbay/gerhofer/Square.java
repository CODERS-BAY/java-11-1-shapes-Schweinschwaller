package com.codersbay.gerhofer;

import java.awt.*;

public class Square extends Shape {
    private double length;

    public Square(Color color, boolean isFilled, double length) {
        super(color, isFilled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        if (this.length <= 0.0) {
            throw new IllegalArgumentException("length is negativ.");
        }
        return this.length * this.length;
    }

    public double getPerimeter() {
        if (this.length <= 0.0) {
            throw new IllegalArgumentException("length is negativ.");
        }
        return this.length * 4;
    }
}
