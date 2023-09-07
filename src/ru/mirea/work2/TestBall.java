package ru.mirea.work2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestBall {
    Ball ball = new Ball(5, 10);

    @Test
    public void testBall() {
        assertEquals(5, ball.getX());
        assertEquals(10, ball.getY());
    }

    @Test
    public void testSetXY() {
        ball.setXY(150, -5);
        assertEquals(150, ball.getX());
        assertEquals(-5, ball.getY());
    }

    @Test
    public void testMove() {
        ball.move(3, 6);
        assertEquals(8, ball.getX());
        assertEquals(16, ball.getY());
    }
}
