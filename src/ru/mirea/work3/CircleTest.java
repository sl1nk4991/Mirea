package ru.mirea.work3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    Circle circle = new Circle(5, 3, 3);

    @Test
    void testCircle() {
        assertEquals(3, circle.getRadius());
        assertEquals(5, circle.getX());
        assertEquals(3, circle.getY());
    }

    @Test
    void testFuncs() {
        assertEquals(18.84955592153876, circle.getCircumference());
        assertEquals(28.274333882308138, circle.getCircleArea());
    }
}
