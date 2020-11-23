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
}
