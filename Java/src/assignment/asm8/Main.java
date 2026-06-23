package assignment.asm8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();

        Book b1 = new Book("B1","Clean Code","Robert");
        Book b2 = new Book("B2","Design Patterns","GoF");

        b1.borrowBy("R1","2024-01-01");

        List<Borrowable> items = new ArrayList<>();
        items.add(b1);
        items.add(b2);

        manager.processAllBorrowable(items);

        List<Notifiable> users = new ArrayList<>();
        users.add(new Reader("S1","An"));
        users.add(new Reader("F1","Binh"));

        manager.notifyAll(users, "Library closes tomorrow");

        System.out.println("\n=== SEARCH TEST ===");

        Library lib = new Library();

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("Search title Clean: " + lib.searchByTitle("Clean").size());
        System.out.println("Search author GoF: " + lib.searchByAuthor("GoF").size());

        System.out.println("\n=== RETURN TEST ===");

        BorrowSlip slip = new BorrowSlip("SL01", "R1", "B1", "2024-01-20");

        System.out.println(slip.isReturned());

        slip.confirmReturn("2024-01-10");

        System.out.println(slip.isReturned());
        System.out.println(slip.getReturnDate());

        System.out.println("\n=== FINE TEST ===");

        Fine fine = new Fine("F1", "R1");

        fine.addFine(10000);
        fine.addFine(5000);

        System.out.println(fine.getTotalFine());

        fine.payFine();

        System.out.println(fine.hasPaidFine());
        System.out.println(fine.getTotalFine());
    }
}