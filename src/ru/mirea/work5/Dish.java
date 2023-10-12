package ru.mirea.work5;

public abstract class Dish {
    protected String content;
    protected String color;
    protected boolean clean;

    public void setContent(String content) { this.content = content; }
    public String getContent() { return content; }
    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
    public void setClean(boolean clean) { this.clean = clean; }
    public boolean isClean() { return clean; }
}
