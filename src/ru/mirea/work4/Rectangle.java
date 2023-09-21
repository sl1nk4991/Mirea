package ru.mirea.work4;

import java.security.InvalidParameterException;

public class Rectangle extends Shape {
    protected double width, length;

    Rectangle() {
        setWidth(1);
        setLength(1);
    }
    Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    Rectangle(double width, double length, String color, boolean filled) {
        setWidth(width);
        setLength(length);
        setColor(color);
        setFilled(filled);
    }
    public double getWidth() { return width; }
    public void setWidth(double width) {
        if(width < 0)
            throw new InvalidParameterException("Width can't be negative");
        this.width = width;
    }
    public double getLength() { return length; }
    public void setLength(double length) {
        if(length < 0)
            throw new InvalidParameterException("Length can't be negative");
        this.length = length;
    }
    @Override
    double getArea() {
        return width * length;
    }
    @Override
    double getPerimeter() { return (width + length) * 2; }
    @Override
    public String toString() {
        return String.format(
                "Rectangle width: [%f], length: [%f], color: [%s], filled: [%b]",
                width, length, color, filled
        );
    }
}
