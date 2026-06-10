package assignment.asm6;

public class StudentReader extends CardReader {
    private String className;

    public StudentReader(String readerId, String fullName, String email, String className, int cardMonths) {
        super(readerId, fullName, email, cardMonths);
        this.className = className;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }

    @Override
    public String getInfo() {
        return "[SV] " + super.getInfo()
                + " | Lop: " + className
                + " | Han muon: " + getMaxBorrowLimit() + " cuon";
    }
}