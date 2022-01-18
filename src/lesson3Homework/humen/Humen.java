package lesson3Homework.humen;

import java.util.Objects;

abstract public class Humen {
    private String name;
    private String surName;
    private int yearOfBirth;

    public Humen(String name, String surName, int yearOfBirth) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
    }

    public Humen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Humen)) return false;
        Humen humen = (Humen) o;
        return getYearOfBirth() == humen.getYearOfBirth() &&
                Objects.equals(getName(), humen.getName()) &&
                Objects.equals(getSurName(), humen.getSurName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurName(), getYearOfBirth());
    }

    @Override
    public String toString() {
        return "Humen{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    abstract public double coeficiet (int yearOfBirth, int experiace);


}
