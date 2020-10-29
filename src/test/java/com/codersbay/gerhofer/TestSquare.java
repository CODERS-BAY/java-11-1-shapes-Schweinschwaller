package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSquare {
    @Test
    public void testSquareMethodes() {
        Square testThing = new Square(new Color(10, 10, 10), true, 2.54);

        assertEquals(testThing.getPerimeter(), 10.16);
        assertEquals(testThing.getArea(), 6.4516);

        testThing.setLength(5.0);
        assertEquals(testThing.getPerimeter(), 20.0);
        assertEquals(testThing.getArea(), 25.0);
    }

    @Test
    public void testSquareIllegalArgumentException() {
        Square testThing = new Square(new Color(10, 10, 10), true, -1.0);
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getPerimeter();
        });
        assertThrows(IllegalArgumentException.class, () -> {
            testThing.getArea();
        });
    }
}