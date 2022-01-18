package lesson3Homework.humen;

import lesson3Homework.ticket.ReadersTicket;

import java.util.Calendar;
import java.util.Objects;

public class Student extends Humen {
    private int cours;
    private ReadersTicket readersTicket;

    public Student(String name, String surName, int yearOfBirth, int cours, ReadersTicket readersTicket) {
        super(name, surName, yearOfBirth);
        this.cours = cours;
        this.readersTicket = readersTicket;
    }

    public Student(int cours, ReadersTicket readersTicket) {
        this.cours = cours;
        this.readersTicket = readersTicket;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public ReadersTicket getReadersTicket() {
        return readersTicket;
    }

    public void setReadersTicket(ReadersTicket readersTicket) {
        this.readersTicket = readersTicket;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getCours() == student.getCours() &&
                Objects.equals(getReadersTicket(), student.getReadersTicket());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCours(), getReadersTicket());
    }

    @Override
    public String toString() {
        return "Student{" +
                "cours=" + cours +
                ", readersTicket=" + readersTicket +
                "} " + super.toString();
    }

    @Override
    public double coeficiet(int yearOfBirth, int experiace) {
        if (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth - yearOfBirth > 16) {
            return 1 + experiace / 10;
        } else {
            return 1;
        }
    }
}
