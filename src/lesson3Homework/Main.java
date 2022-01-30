package lesson3Homework;

import lesson3Homework.books.*;
import lesson3Homework.ticket.ReadersTicket;
import lesson3Homework.ticket.University;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

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
                new scientificBook(1997, "ABloh", "JAVA", true, Subjects.PHILOSOPHY));
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
//        main.checkOneBookCorresponds(myList,948);
//        main.checkAllBooksCorresponds(myListScientificBooks, BIOLOGY);
//        main.checkNoneBooksCorresponds(myListFictionBooks, FANTASY);
//        main.findOlderBook(myListFictionBooks, myListScientificBooks);

        ReadersTicket ticket =
                new ReadersTicket(555, University.LNUIF,LocalDate.of(2021,1,30));

        main.isValidTicket(ticket);


    }

    public void showAvailableBooks(List<Book> myList) {
        myList.stream()
                .filter(book -> book.isAvailable())
                .collect(Collectors.toList())
                .forEach(x -> System.out.println(x));
    }

    public void showAvailableBooks(List<Book> myList, String authorName) {
        myList.stream()
                .filter(book -> book.isAvailable())
                .filter(book -> book.getAutor().equals(authorName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public void sortListByTitle(List<Book> myList) {
        myList.stream()
                .sorted(Comparator.comparing(Book::getTitle)
                        .thenComparing(Book::getAutor)
                        .thenComparing(Book::getYearOfPublication))
                .forEach(x -> System.out.println(x));
    }

    public void checkOneBookCorresponds(List<Book> myList, int year) {
        boolean present = myList.stream()
                .filter(x -> x.getYearOfPublication() < year)
                .findAny()
                .isPresent();
        System.out.println(present);
    }

    public void checkAllBooksCorresponds(List<scientificBook> myList, Subjects subjects) {
        System.out.println(myList.stream()
                .allMatch(x -> x.getSubject().equals(subjects)));

    }

    public void checkNoneBooksCorresponds(List<FictionBooks> myList, Genre genre) {
        System.out.println(myList.stream()
                .noneMatch(x -> x.getGenre().equals(genre)));

    }

    public void findOlderBook(List<FictionBooks> fictionBooks, List<scientificBook> scientificBooks) {


        List<FictionBooks> oldestFictionBooks = fictionBooks.stream()
                .collect(Collectors.groupingBy(FictionBooks::getGenre))
                .entrySet().stream()
                .map(Map.Entry::getValue)
                .map(list -> list.stream()
                        .min(Comparator.comparing(book -> book.getYearOfPublication()))
                        .get())
                .collect(Collectors.toList());

        List<scientificBook> oldesrScientificBooks = scientificBooks.stream()
                .collect(Collectors.groupingBy(scientificBook::getSubject))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .map(list -> list.stream()
                        .min(Comparator.comparing(book -> book.getYearOfPublication()))
                        .get())
                .collect(Collectors.toList());

        List<Book> oldestBooks = new ArrayList<>();
        oldestBooks.addAll(oldestFictionBooks);
        oldestBooks.addAll(oldesrScientificBooks);

        oldestBooks.stream()
                .sorted(Comparator.comparing(book -> book.getTitle()))
                .forEach(book -> System.out.println(book.getTitle() + " " + book.getYearOfPublication() + ","));
    }

    public void isValidTicket(ReadersTicket ticket){
        LocalDate today = LocalDate.now();

        if (today.isAfter(ticket.getDate())){
            System.out.println("Читатський просрочений пиздуй звідси бігом");
        }else {
            System.out.println("читатський дійсний до " + ticket.getDate());
        }



    }

}



