package com.codersbay.gerhofer;

import java.awt.*;

public class Square extends Rectangle {

    public Square(Color color, boolean isFilled, double length) {
        super(color, isFilled, length, length);
    }

    public double getLength() {
        return super.getLength();
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    public double getArea() {
        if (super.getLength() <= 0.0) {
            throw new IllegalArgumentException("length is negativ.");
        }
        return super.getLength() * super.getLength();
    }

    public double getPerimeter() {
        if (super.getLength() <= 0.0) {
            throw new IllegalArgumentException("length is negativ.");
        }
        return super.getLength() * 4;
    }
}
