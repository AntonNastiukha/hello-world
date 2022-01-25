package lesson3Homework.books;

import java.util.Objects;

public class FictionBooks extends Book {
    private Genre genre;

    public FictionBooks(int yearOfPublication, String autor, String title, boolean isAvailable, Genre genre) {
        super(yearOfPublication, autor, title, isAvailable);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FictionBooks)) return false;
        if (!super.equals(o)) return false;
        FictionBooks that = (FictionBooks) o;
        return getGenre() == that.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGenre());
    }

    @Override
    public String toString() {
        return "FictionBooks{" +
                "genre=" + genre +
                "} " + super.toString();
    }
}
