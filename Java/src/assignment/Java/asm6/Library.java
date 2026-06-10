package assignment.asm6;

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

    public void printAllReaders() {
        System.out.println("===== DANH SACH DOC GIA =====");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
    }

    public double calculateTotalLateFee(int daysLate) {
        double total = 0;

        for (Reader reader : readers) {
            total += reader.calculateLateFee(daysLate);
        }

        return total;
    }

    public Reader findReaderByName(String keyword) {
        if (keyword == null) {
            return null;
        }

        String lowerKeyword = keyword.toLowerCase();

        for (Reader reader : readers) {
            if (reader.getFullName().toLowerCase().contains(lowerKeyword)) {
                return reader;
            }
        }

        return null;
    }

    public void printSeniorReaders() {
        System.out.println("===== DANH SACH DOC GIA NGUOI CAO TUOI =====");

        for (Reader reader : readers) {
            if (reader instanceof SeniorReader) {
                SeniorReader seniorReader = (SeniorReader) reader;

                System.out.println(seniorReader.getInfo());
                System.out.println("Ma the NCT: " + seniorReader.getSeniorCardNumber());
            }
        }
    }

    public void renewAllCardReaders(List<CardReader> cardReaders, int months) {
        for (CardReader reader : cardReaders) {
            reader.renewCard(months);
        }
    }
}