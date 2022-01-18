package lesson3Homework.humen;

import java.util.Calendar;
import java.util.Objects;

public class Librarian extends Humen{
    private int experience;

    public Librarian(String name, String surName, int yearOfBirth, int experience) {
        super(name, surName, yearOfBirth);
        this.experience = experience;
    }

    public Librarian(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Librarian)) return false;
        if (!super.equals(o)) return false;
        Librarian librarian = (Librarian) o;
        return getExperience() == librarian.getExperience();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getExperience());
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "experience=" + experience +
                "} " + super.toString();
    }

    @Override
    public double coeficiet(int yearOfBirth, int experience) {
        return  1.0+
                1/(Calendar.getInstance().get(Calendar.YEAR)-yearOfBirth)+
                experience/10;
    }
}
