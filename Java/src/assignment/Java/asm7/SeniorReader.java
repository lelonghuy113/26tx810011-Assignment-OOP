package assignment.asm7;

public class SeniorReader extends Reader {
    private String seniorCardId;

    public SeniorReader(String readerId, String fullName, String seniorCardId) {
        super(readerId, fullName);
        this.seniorCardId = seniorCardId;
    }

    @Override
    public String getInfo() {
        return "Nguoi cao tuoi: " + readerId + " - " + fullName + ", the: " + seniorCardId;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0;
    }

    @Override
    public int getMaxBorrowLimit() {
        return 4;
    }

    @Override
    protected boolean isBookAllowed(Book book) {
        return true;
    }

    @Override
    protected String getRejectMessage() {
        return "";
    }

    @Override
    protected void afterBorrowed(Book book) {
        super.afterBorrowed(book);
        System.out.println("  -> Ghi nhan mien phi phat cho nguoi cao tuoi");
    }
}
