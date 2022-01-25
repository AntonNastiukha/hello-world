package lesson3Homework;

import lesson3Homework.books.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static lesson3Homework.books.Genre.FANTASY;
import static lesson3Homework.books.Subjects.BIOLOGY;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();


        List<FictionBooks> myListFictionBooks = new ArrayList<>();

        myListFictionBooks.add(
                new FictionBooks(2005, "Vern", "1000 lie", true, Genre.SCI_FI));
        myListFictionBooks.add(
                new FictionBooks(1984, "Miln", "Vini puh", false, Genre.ADVENTURE_BOOK));
        myListFictionBooks.add(
                new FictionBooks(1949, "Shevchenko", "Kobzar", false, Genre.LIRIKS));
        myListFictionBooks.add(
                new FictionBooks(1947, "Frenk Gerbert", "Duna", true, FANTASY));
        myListFictionBooks.add(
                new FictionBooks(1986, "King", "It", false, Genre.SCI_FI));
        myListFictionBooks.add(
                new FictionBooks(1948, "Tolkien", "Lord of the ring", true, FANTASY));
        myListFictionBooks.add(
                new FictionBooks(2022, "Martin", "Gemes of the thron", false, FANTASY));
        myListFictionBooks.add(
                new FictionBooks(2011, "Linsi", "Cum", false, FANTASY));
        myListFictionBooks.add(
                new FictionBooks(2018, "Har", "Bartimeus", true, FANTASY));


        List<scientificBook> myListScientificBooks = new ArrayList<>();

        myListScientificBooks.add(
                new scientificBook(2021, "Gir", "Math for stsrters", true, Subjects.MATH));
        myListScientificBooks.add(
                new scientificBook(2000, "Einstein", "Probability teory", true, Subjects.PHYSICS));
        myListScientificBooks.add(
                new scientificBook(1966, "Zapolsci", "Poedenie cheloeka", true, BIOLOGY));
        myListScientificBooks.add(
                new scientificBook(2001, "Soron", "Hristomaty", true, Subjects.ENGLISH_LITERATURE));
        myListScientificBooks.add(
                new scientificBook(1998, "Bloh", "JAVA", true, Subjects.PHILOSOPHY));
        myListScientificBooks.add(
                new scientificBook(2028, "Nastiukha", "Polimer destraction", true, Subjects.CHEMISTRY));
        myListScientificBooks.add(
                new scientificBook(1999, "Bloh", "JAVA", true, Subjects.PHILOSOPHY));
        myListScientificBooks.add(
                new scientificBook(2002, "Orvel", "Lie to me", true, Subjects.PHILOSOPHY));
        myListScientificBooks.add(
                new scientificBook(1944, "Om", "Zakon Oma", true, Subjects.PHYSICS));

        List<Book> myList = new ArrayList<>();
        myList.addAll(myListFictionBooks);
        myList.addAll(myListScientificBooks);

//        main.showAvailableBooks(myList);
//        main.showAvailableBooks(myList,"Om");
//        main.sortListByTitle(myList);
//        main.checkOneBookCorresponds(myList,1948);
//        main.checkAllBooksCorresponds(myListScientificBooks, BIOLOGY);
//        main.checkNoneBooksCorresponds(myListFictionBooks, FANTASY);
        List<Book> olderBook = main.findOlderBook(myListFictionBooks, myListScientificBooks);
      main.sortByTitle(olderBook);
//        for (Book book : myList) {
//            System.out.println(book.toString());
//        }


    }

    public void showAvailableBooks(List<Book> myList) {
        for (Book oneOfBook : myList) {
            if (oneOfBook.isAvailable()) {
                System.out.println(oneOfBook.toString());
            }
        }
    }

    public void showAvailableBooks(List<Book> myList, String authorName) {
        for (Book oneOfBook : myList) {
            if (oneOfBook.isAvailable() && authorName.equals(oneOfBook.getAutor())) {
                System.out.println(oneOfBook.toString());
            }
        }
    }

    public void sortListByTitle(List<Book> myList) {
        Collections.sort(myList);
    }

    public void checkOneBookCorresponds(List<Book> myList, int year) {
        boolean isBookOlderThenYear = false;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getYearOfPublication() < year) {
                isBookOlderThenYear = true;
                break;
            }
        }
        System.out.println(isBookOlderThenYear);
    }

    public void checkAllBooksCorresponds(List<scientificBook> myList, Subjects subjects) {
        boolean isAllBooksOnThatSubject = true;
        for (scientificBook scientificBook : myList) {
            if (scientificBook.getSubject().equals(subjects)) {
            } else {
                isAllBooksOnThatSubject = false;
                break;
            }
        }
        System.out.println(isAllBooksOnThatSubject);

    }

    public void checkNoneBooksCorresponds(List<FictionBooks> myList, Genre genre) {
        boolean isNoneBookCorresponds = true;
        for (FictionBooks fictionBooks : myList) {
            if (fictionBooks.getGenre().equals(genre)) {
                isNoneBookCorresponds = false;
                break;
            }
        }
        System.out.println(isNoneBookCorresponds);

    }

    public List<Book> findOlderBook(List<FictionBooks> fictionBooks, List<scientificBook> scientificBooks) {
        List<Book> olderBook = new ArrayList<>();

        Genre[] values = Genre.values();
        for (Genre value : values) {
            List<Book> hhh = new ArrayList<>();
            for (FictionBooks fictionBook : fictionBooks) {
                if (value.equals(fictionBook.getGenre())) {
                    hhh.add(fictionBook);
                }
            }
            sortByYear(hhh);
            if (hhh.size() > 0) {
                olderBook.add(hhh.get(0));
            }
        }

        Subjects[] values1 = Subjects.values();
        for (Subjects subjects : values1) {
            List<Book> ggg = new ArrayList<>();
            for (scientificBook scientificBook : scientificBooks) {
                if (subjects.equals(scientificBook.getSubject())) {
                    ggg.add(scientificBook);
                }
            }
            sortByYear(ggg);
            if (ggg.size() > 0) {
                olderBook.add(ggg.get(0));
            }
        }
        return olderBook;

    }

    public void sortByTitle(List<Book> booksList) {
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
        booksList.sort(comparator);
        for (Book book : booksList) {
            System.out.println(book.getTitle() + " " + book.getYearOfPublication() + " " + ",");
        }


    }

    public List<Book> sortByYear(List<Book> books) {
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getYearOfPublication() - o2.getYearOfPublication();
            }
        };
        books.sort(comparator);
        return books;
    }


}



