package lesson3Homework.books;

import java.util.Objects;

public class scientificBook extends Book {
    private Subjects subject;


    public scientificBook(int yearOfPublication, String autor, String title, boolean isAvailable, Subjects subject) {
        super(yearOfPublication, autor, title, isAvailable);
        this.subject = subject;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof scientificBook)) return false;
        if (!super.equals(o)) return false;
        scientificBook that = (scientificBook) o;
        return getSubject() == that.getSubject();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSubject());
    }

    @Override
    public String toString() {
        return "scientificBook{" +
                "subject=" + subject +
                "} " + super.toString();
    }
}