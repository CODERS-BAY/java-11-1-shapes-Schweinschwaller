package com.codersbay.gerhofer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Shapes");
        System.out.println(Math.PI);

        Shape myObject = new Rectangle(new Color(10, 10, 10), true, 5.0, 8.0);
        System.out.println("Rectangle 5*8");
        System.out.println("Area:");
        System.out.println(myObject.getArea());

        System.out.println("Perimeter:");
        System.out.println(myObject.getPerimeter());

        System.out.println("---");

        myObject = new Square(new Color(10, 10, 10), true, 5.0);
        System.out.println("Square 5");
        System.out.println("Area:");
        System.out.println(myObject.getArea());

        System.out.println("Perimeter:");
        System.out.println(myObject.getPerimeter());

        System.out.println("---");

        myObject = new Circle(new Color(10, 10, 10), true, 3.0);
        System.out.println("Circle 3");
        System.out.println("Area:");
        System.out.println(myObject.getArea());

        System.out.println("Perimeter:");
        System.out.println(myObject.getPerimeter());

    }

}
