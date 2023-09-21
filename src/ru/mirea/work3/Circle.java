package ru.mirea.work3;

import java.security.InvalidParameterException;
import java.lang.Math;

public class Circle {
    private double X, Y, radius;

    Circle(double X, double Y, double radius) {
        if(radius < 0) {
            throw new InvalidParameterException("Radius can't be negative");
        }
        this.radius = radius;
        this.X = X;
        this.Y = Y;
    }
    Circle() {
        radius = 0.0;
        this.X = 0.0;
        this.Y = 0.0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setXY(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }
    public double getX() { return this.X; }
    public double getY() { return this.Y; }
    public double getCircumference() {
        return (2 * Math.PI * radius);
    }
    public double getCircleArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
