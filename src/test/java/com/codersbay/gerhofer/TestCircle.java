package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCircle {
    @Test
    public void testCircleMethodes() {
        Circle testThing = new Circle(new Color(10, 10, 10), true, 2.54);

        assertEquals(testThing.getPerimeter(), 15.95929068023615);
        assertEquals(testThing.getArea(), 20.268299163899908);

        testThing.setRadius(5.0);
        assertEquals(testThing.getPerimeter(), 31.41592653589793);
        assertEquals(testThing.getArea(), 78.53981633974483);
    }

    @Test
    public void testCircleIllegalArgumentException() {
        Circle testThing = new Circle(new Color(10, 10, 10), true, -1.0);
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getPerimeter();
        });
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getArea();
        });
    }
}
