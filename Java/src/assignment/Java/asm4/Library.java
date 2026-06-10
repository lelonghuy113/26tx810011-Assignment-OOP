package assignment.asm4;

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
        System.out.println("===== DANH SÁCH SÁCH =====");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printReaders() {
        System.out.println("===== DANH SÁCH ĐỘC GIẢ =====");

        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }
}