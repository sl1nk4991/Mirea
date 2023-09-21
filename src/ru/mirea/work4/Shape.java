package ru.mirea.work4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        this.color = "none";
        filled = false;
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    abstract double getArea();
    abstract double getPerimeter();
    public abstract String toString();
}
