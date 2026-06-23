package assignment.asm8;

public class CharityFeePolicy implements FeePolicy {
    public double calculateFine(int days) {
        return Math.min(days * 3000, 50000);
    }
}