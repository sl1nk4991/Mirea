package ru.mirea.work2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestAuthor {
    Author author = new Author("John Doe", "johnd@dom.local", 'm');

    @Test
    void testAuthor() {
        assertEquals("John Doe", author.getName());
        assertEquals("johnd@dom.local", author.getEmail());
        assertEquals('m', author.getGender());
        assertEquals("Name: [John Doe], Email: [johnd@dom.local], Gender: [m]", author.toString());
    }

    @Test
    void testSetEmail() {
        author.setEmail("johndoe@dom.local");
        assertEquals("johndoe@dom.local", author.getEmail());
    }
}
