package ru.mirea.work4;

public class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return String.format("MovableCircle@(radius: %d; x: %d; y: %d; xSpeed: %d, ySpeed: %d)",
                this.radius, this.center.x, this.center.y, this.center.xSpeed, this.center.ySpeed);
    }
}
