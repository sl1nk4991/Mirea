package ru.mirea.work2;

import java.security.InvalidParameterException;

public class Circle {
    private Point center = new Point();
    private double radius;

    Circle(double x, double y, double radius) {
        center.setXY(x, y);
        if(radius < 0) {
            throw new InvalidParameterException("Radius can't be negative");
        }
        this.radius = radius;
    }
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    Circle() {
        radius = 0.0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setXY(double X, double Y) {
        center.setXY(X, Y);
    }
    public double getX() {
        return center.getX();
    }
    public double getY() {
        return center.getY();
    }
}
