package ru.mirea.work2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class Tester {
    Circle[] circles;
    int n = 3;

    public Tester() {
        circles = new Circle[n];
        for(int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }
    }

    @Test
    void testCircles() {
        Random random = new Random();
        for(Circle c: circles) {
            int randX = random.nextInt(1000);
            int randY = random.nextInt(1000);
            int randRadius = random.nextInt(100);

            c.setRadius(randRadius);
            c.setXY(randX, randY);
            assertEquals(randRadius, c.getRadius());
            assertEquals(randX, c.getX());
            assertEquals(randY, c.getY());
        }
    }
}
