package assignment.asm6;

public class GuestReader extends Reader {
    public GuestReader(String readerId, String fullName, String email) {
        super(readerId, fullName, email);
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0.0;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "[GUEST] " + super.getInfo() + " | Chi doc tai cho";
    }
}