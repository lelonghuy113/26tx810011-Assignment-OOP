package assignment.asm8;

import java.util.List;

public interface Notifiable {
    void sendNotification(String message);
    List<String> getNotificationHistory();

    default void sendOverdueNotification() {
        sendNotification("You have overdue books!");
    }
}