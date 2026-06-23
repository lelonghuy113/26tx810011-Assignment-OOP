package assignment.asm8;

public class BorrowSlip implements Returnable {

    private String slipId;
    private String returnDate;

    public BorrowSlip(String slipId) {
        this.slipId = slipId;
    }

    public BorrowSlip(String slipId, String readerId, String bookId, String dueDate) {
        this.slipId = slipId;
    }

    @Override
    public void confirmReturn(String date) {
        this.returnDate = date;
        System.out.println("Slip " + slipId + " confirmed return on " + date);
    }

    @Override
    public String getReturnDate() {
        return returnDate;
    }

    @Override
    public boolean isReturned() {
        return returnDate != null;
    }
}