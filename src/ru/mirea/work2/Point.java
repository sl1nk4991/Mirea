package ru.mirea.work2;

public class Point {
    private double X = 0.0, Y = 0.0;

    Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }
    Point() {}
    public void setXY(double x, double y) {
        this.X = x;
        this.Y = y;
    }
    public double getX() {
        return X;
    }
    public double getY() {
        return Y;
    }
    public void move(double dX, double dY) {
        this.X += dX;
        this.Y += dY;
    }
}
