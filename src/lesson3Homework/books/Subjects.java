package lesson3Homework.books;

public enum Subjects {
    PHYSICS("physics"),
    CHEMISTRY("chemistry"),
    PHILOSOPHY("philosophy"),
    HISTORY("history"),
    BIOLOGY("biology"),
    MATH("math"),
    ENGLISH_LITERATURE("english literature"),
    ENGLISH_LANGUAGE("english laguage"),
    FOREIGN_LITERATURE("foreign literature");

    private String subjects;

    Subjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjects='" + subjects + '\'' +
                "} " + super.toString();
    }
}
