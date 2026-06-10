package assignment.asm5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void printBooks() {
        System.out.println("===== DANH SACH SACH =====");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showAllReaders() {
        System.out.println("===== DANH SACH DOC GIA =====");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
    }

    public void showLateFees(int daysLate) {
        System.out.println("===== PHI PHAT TRE HAN " + daysLate + " NGAY =====");
        for (Reader reader : readers) {
            System.out.printf("%-25s | Fee: %,.0f VND%n",
                    reader.getFullName(),
                    reader.calculateLateFee(daysLate));
        }
    }
}