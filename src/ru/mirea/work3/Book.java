package ru.mirea.work3;

public class Book {
    String title;
    String author;
    String date;
    long pages;

    Book(String title, String author, String date, long pages) {
        this.title      = title;
        this.author     = author;
        this.date       = date;
        this.pages      = pages;
    }
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
    public void setAuthor(String author) { this.author = author; }
    public String getAuthor() { return author; }
    public void setDate(String date) { this.date = date; }
    public String getDate() { return date; }
    public void setPages(long pages) { this.pages = pages; }
    public long getPages() { return pages; }
}
