package lesson3Homework.books;

import java.util.Objects;

public class FictionBooks extends Book {
    private int price;

    public FictionBooks(int yearOfPublication, String autor, String title, int price) {
        super(yearOfPublication, autor, title);
        this.price = price;
    }

    public FictionBooks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FictionBooks)) return false;
        if (!super.equals(o)) return false;
        FictionBooks that = (FictionBooks) o;
        return getPrice() == that.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrice());
    }

    @Override
    public String toString() {
        return "FictionBooks{" +
                "price=" + price +
                "} " + super.toString();
    }
}
