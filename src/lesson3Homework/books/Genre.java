package lesson3Homework.books;

public enum Genre {
    SHORT_STORY("short story"),
    NOVEL("novel"),
    AUTOBIOGRAPHY("autobiography"),
    BIOGRAPHY("biography"),
    LIRIKS("liriks"),
    ADVENTURE_BOOK("adventure book"),
    FANTASY("fantasy"),
    SCI_FI("sci-fi");

    private String gener;

    Genre(String gener) {
        this.gener = gener;
    }

    public String getGener() {
        return gener;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "gener='" + gener + '\'' +
                "} " + super.toString();
    }
}
