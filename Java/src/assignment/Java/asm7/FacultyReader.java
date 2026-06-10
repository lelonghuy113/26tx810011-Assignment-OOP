package assignment.asm7;

public class FacultyReader extends Reader {
    private String facultyCode;

    public FacultyReader(String readerId, String fullName, String facultyCode) {
        super(readerId, fullName);
        this.facultyCode = facultyCode;
    }

    @Override
    public String getInfo() {
        return "Giang vien: " + readerId + " - " + fullName + ", khoa: " + facultyCode;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return Math.max(0, daysLate) * 5000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }

    @Override
    protected boolean isBookAllowed(Book book) {
        return true;
    }

    @Override
    protected String getRejectMessage() {
        return "";
    }
}
