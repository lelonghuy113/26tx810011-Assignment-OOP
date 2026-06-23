package assignment.asm8;

public class LateFeePolicy implements FeePolicy {
    public double calculateFine(int days) {
        return days * 7000;
    }
}