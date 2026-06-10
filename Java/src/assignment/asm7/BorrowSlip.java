package assignment.asm7;

import assignment.asm7.Book;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowSlip {
    private Reader reader;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public BorrowSlip(Reader reader, Book book, LocalDate borrowDate) {
        this.reader = reader;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = borrowDate.plusDays(14);
    }

    public int calculateDaysLate(LocalDate returnDate) {
        if (!returnDate.isAfter(dueDate)) {
            return 0;
        }
        return (int) ChronoUnit.DAYS.between(dueDate, returnDate);
    }

    public Reader getReader() {
        return reader;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getInfo() {
        return String.format("Phieu muon: %s - %s, ngay muon: %s, han tra: %s",
                reader.getFullName(), book.getTitle(), borrowDate, dueDate);
    }
}
