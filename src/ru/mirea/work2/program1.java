package ru.mirea.work2;

public class program1 {
    public static void main(String[] args) {
        Author author = new Author("name", "email", 'a');
        TestAuthor testAuthor = new TestAuthor();

        System.out.println(author.toString());
    }
}
