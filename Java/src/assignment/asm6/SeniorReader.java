package assignment.asm6;

public class SeniorReader extends CardReader {
    private String seniorCardNumber;

    public SeniorReader(String readerId, String fullName, String email, String seniorCardNumber, int cardMonths) {
        super(readerId, fullName, email, cardMonths);
        this.seniorCardNumber = seniorCardNumber;
    }

    public String getSeniorCardNumber() {
        return seniorCardNumber;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0.0;
    }

    @Override
    public int getMaxBorrowLimit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [NCT - MIEN PHAT]";
    }
}