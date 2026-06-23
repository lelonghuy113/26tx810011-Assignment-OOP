package assignment.asm8;

import java.util.List;

public interface Searchable {
    List<Book> searchByTitle(String keyword);
    List<Book> searchByAuthor(String keyword);

    static String normalizeKeyword(String str) {
        return str == null ? "" : str.trim().toLowerCase();
    }
}