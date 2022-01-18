package lesson3Homework.books;

import java.util.Objects;

public class Book {
    private int yearOfPublication;
    private String autor;
    private String title;

    public Book(int yearOfPublication, String autor, String title) {
        this.yearOfPublication = yearOfPublication;
        this.autor = autor;
        this.title = title;
    }

    public Book() {
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() &&
                Objects.equals(getAutor(), book.getAutor()) &&
                Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYearOfPublication(), getAutor(), getTitle());
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearOfPublication=" + yearOfPublication +
                ", autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
