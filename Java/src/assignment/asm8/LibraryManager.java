package assignment.asm8;

import java.util.*;

public class LibraryManager {

    public void processAllBorrowable(List<Borrowable> items) {
        System.out.println("=== BORROWABLE ITEM STATUS ===");

        for (Borrowable item : items) {
            String s = item.isAvailable()
                    ? "Available"
                    : "Borrowed by " + item.getBorrowerId();

            System.out.println("  -> " + s);
        }
    }

    public void notifyAll(List<Notifiable> users, String message) {
        System.out.println("=== SENDING NOTIFICATIONS ===");

        for (Notifiable user : users) {
            user.sendNotification(message);
        }
    }
}