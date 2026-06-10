package assignment.asm7;

public class StudentReader extends Reader {
    private String studentType;

    public StudentReader(String readerId, String fullName, String studentType) {
        super(readerId, fullName);
        this.studentType = studentType;
    }

    @Override
    public String getInfo() {
        return "Sinh vien: " + readerId + " - " + fullName + ", loai: " + studentType;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return Math.max(0, daysLate) * 2000;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }

    @Override
    protected boolean isBookAllowed(Book book) {
        return !book.isReferenceOnly();
    }

    @Override
    protected String getRejectMessage() {
        return "Sach tham khao chi doc tai cho, sinh vien khong duoc mang ve";
    }
}
