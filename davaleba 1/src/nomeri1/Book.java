package nomeri1;

import java.util.Objects;

public class Book {
    private String title;
    private int numberOfPages;
    private String genre;
    private Writer author;

    public Book(String title, int numberOfPages, String genre, Writer author) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return numberOfPages == book.numberOfPages &&
                Objects.equals(title, book.title) &&
                Objects.equals(genre, book.genre) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, numberOfPages, genre, author);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n Pages: " + numberOfPages + "\n Genre: " + genre + "\n Author: " + author;
    }
}
