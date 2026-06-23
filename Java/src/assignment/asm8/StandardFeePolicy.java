package assignment.asm8;

public class StandardFeePolicy implements FeePolicy {
    public double calculateFine(int days) {
        return days * 5000;
    }
}