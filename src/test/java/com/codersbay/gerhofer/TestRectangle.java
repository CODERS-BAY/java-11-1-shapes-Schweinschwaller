package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestRectangle {
    @Test
    public void testRectangleMethodes() {
        Rectangle testThing = new Rectangle(new Color(10, 10, 10), true, 2.54, 4.52);

        assertEquals(testThing.getPerimeter(), 14.12);
        assertEquals(testThing.getArea(), 11.480799999999999);

        testThing.setLength(5.0);
        testThing.setWidth(10.0);
        assertEquals(testThing.getPerimeter(), 30.0);
        assertEquals(testThing.getArea(), 50.0);
    }

    @Test
    public void testRectangleIllegalArgumentException() {
        Rectangle testThing = new Rectangle(new Color(10, 10, 10), true, -1.0, 5.0);
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getPerimeter();
        });
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getArea();
        });

        testThing.setLength(1.0);
        testThing.setWidth(-1.0);
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getPerimeter();
        });
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getArea();
        });

        testThing.setLength(-1.0);
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getPerimeter();
        });
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getArea();
        });
    }
}
