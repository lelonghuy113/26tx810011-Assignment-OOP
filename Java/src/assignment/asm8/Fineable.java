package assignment.asm8;

public interface Fineable {
    void addFine(double amount);
    double getTotalFine();
    boolean hasPaidFine();
    void payFine();

    default double calculateTotalFine(int daysOverdue) {
        return Math.min(daysOverdue * 5000, 200000);
    }

    static boolean isValidFineAmount(double amount) {
        return amount >= 0 && amount <= 200000;
    }
}