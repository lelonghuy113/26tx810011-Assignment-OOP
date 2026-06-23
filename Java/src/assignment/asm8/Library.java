package assignment.asm8;

import java.util.*;

public class Library implements Searchable {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    @Override
    public List<Book> searchByTitle(String keyword) {
        List<Book> result = new ArrayList<>();
        String kw = Searchable.normalizeKeyword(keyword);

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(kw)) {
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Book> searchByAuthor(String keyword) {
        List<Book> result = new ArrayList<>();
        String kw = Searchable.normalizeKeyword(keyword);

        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(kw)) {
                result.add(b);
            }
        }
        return result;
    }
}