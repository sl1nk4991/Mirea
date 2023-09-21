package ru.mirea.work4;

import java.security.InvalidParameterException;

public class Circle extends Shape {
    protected double radius;

    Circle() { setRadius(1); }
    Circle(double radius) { setRadius(radius); }
    Circle(double radius, String color, boolean filled) {
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new InvalidParameterException("Radius can't be negative");
        }
        this.radius = radius;
    }
    @Override
    double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }
    @Override
    double getPerimeter() {
        return (2 * Math.PI * radius);
    }
    @Override
    public String toString() {
        return String.format("Circle radius: [%f], color: [%s], filled: [%b]", radius, color, filled);
    }
}
