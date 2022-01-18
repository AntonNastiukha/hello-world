package lesson3Homework.ticket;

import java.util.Objects;

public class ReadersTicket {
    private int id;
    private University university;
    private int validUntilYear;

    public ReadersTicket(University university, int validUntilYear) {
        this.university = university;
        this.validUntilYear = validUntilYear;
    }

    public ReadersTicket() {
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public int getValidUntilYear() {
        return validUntilYear;
    }

    public void setValidUntilYear(int validUntilYear) {
        this.validUntilYear = validUntilYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReadersTicket)) return false;
        ReadersTicket that = (ReadersTicket) o;
        return getValidUntilYear() == that.getValidUntilYear() &&
                getUniversity() == that.getUniversity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUniversity(), getValidUntilYear());
    }

    @Override
    public String toString() {
        return "ReadersTicket{" +
                "university=" + university +
                ", validUntilYear=" + validUntilYear +
                '}';
    }
}
