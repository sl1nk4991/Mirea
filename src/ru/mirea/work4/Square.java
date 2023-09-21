package ru.mirea.work4;

import java.security.InvalidParameterException;

public class Square extends Rectangle {
    private double side;

    Square() {
        setSide(1);
    }
    Square(double side) {
        setSide(side);
    }
    Square(double side, String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);
    }
    public double getSide() { return side; }
    public void setSide(double side) {
        try {
            setWidth(side);
            setLength(side);
        } catch (InvalidParameterException e) {
            throw new InvalidParameterException("Side can't be negative");
        }
        this.side = side;
    }
    @Override
    public String toString() {
        return String.format("Square side: [%f], color: [%s], filled: [%b]", side, color, filled);
    }
}
