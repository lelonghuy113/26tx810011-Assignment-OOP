package assignment.asm6;

public class FacultyReader extends CardReader {
    private String department;

    public FacultyReader(String readerId, String fullName, String email, String department, int cardMonths) {
        super(readerId, fullName, email, cardMonths);
        this.department = department;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    public String getInfo() {
        return "[GV] " + super.getInfo()
                + " | Khoa: " + department
                + " | Han muon: " + getMaxBorrowLimit() + " cuon";
    }
}