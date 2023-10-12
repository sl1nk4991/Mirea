package ru.mirea.work4;

public class MovableRectangle implements Movable {
    MovablePoint topLeft, bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    protected void checkSpeed() {
        if (topLeft.xSpeed != bottomRight.xSpeed ||
                topLeft.ySpeed != bottomRight.ySpeed) {
            throw new RuntimeException("invalid speed");
        }
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
        checkSpeed();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
        checkSpeed();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
        checkSpeed();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
        checkSpeed();
    }
}
