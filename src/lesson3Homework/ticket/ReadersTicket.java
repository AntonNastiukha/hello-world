package lesson3Homework.ticket;

import java.time.LocalDate;
import java.util.Objects;

public class ReadersTicket {
    private int id;
    private University university;
    private LocalDate date;

    public ReadersTicket(int id, University university, LocalDate date) {
        this.id = id;
        this.university = university;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReadersTicket)) return false;
        ReadersTicket ticket = (ReadersTicket) o;
        return getId() == ticket.getId() &&
                getUniversity() == ticket.getUniversity() &&
                Objects.equals(getDate(), ticket.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUniversity(), getDate());
    }

    @Override
    public String toString() {
        return "ReadersTicket{" +
                "id=" + id +
                ", university=" + university +
                ", date=" + date +
                '}';
    }
}


