package ru.mirea.work3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookTest {
    String title = "The Lord of the Rings: The Return of the King",
    author = "J. R. R. Tolkien",
    date = "20.10.1955";
    long pages = 416;
    Book book = new Book(title, author, date, pages);

    @Test
    void testBook() {
        assertEquals(title, book.getTitle());
        assertEquals(author, book.getAuthor());
        assertEquals(date, book.getDate());
        assertEquals(pages, book.getPages());
    }
}
