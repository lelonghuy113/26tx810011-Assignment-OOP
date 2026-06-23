package assignment.asm8;

public class Fine implements Fineable {

    private double totalFine;
    private boolean paid;

    public Fine(String f1, String r1) {
    }

    @Override
    public void addFine(double amount) {
        if (Fineable.isValidFineAmount(amount)) {
            totalFine += amount;
        }
    }

    @Override
    public double getTotalFine() {
        return totalFine;
    }

    @Override
    public boolean hasPaidFine() {
        return paid;
    }

    @Override
    public void payFine() {
        System.out.println("Fine paid: " + totalFine + " VND");
        paid = true;
        totalFine = 0;
    }
}