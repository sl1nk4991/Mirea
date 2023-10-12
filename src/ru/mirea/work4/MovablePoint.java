package ru.mirea.work4;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        this.ySpeed++;
    }

    @Override
    public void moveDown() {
        this.ySpeed--;
    }

    @Override
    public void moveLeft() {
        this.xSpeed--;
    }

    @Override
    public void moveRight() {
        this.ySpeed++;
    }

    @Override
    public String toString() {
        return String.format("MovablePoint@(x: %d; y: %d; xSpeed: %d, ySpeed: %d)", x, y, xSpeed, ySpeed);
    }
}
