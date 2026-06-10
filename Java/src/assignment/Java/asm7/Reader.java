package assignment.asm7;

public abstract class Reader {
    protected String readerId;
    protected String fullName;
    protected int currentBorrowCount;

    public Reader(String readerId, String fullName) {
        this.readerId = readerId;
        this.fullName = fullName;
        this.currentBorrowCount = 0;
    }

    public abstract String getInfo();

    public abstract double calculateLateFee(int daysLate);

    public abstract int getMaxBorrowLimit();

    public final BorrowResult processBorrow(Book book) {
        if (!canBorrowMore()) {
            return new BorrowResult(false, "Da dat gioi han muon: " + getMaxBorrowLimit() + " cuon");
        }

        if (!isBookAllowed(book)) {
            return new BorrowResult(false, getRejectMessage());
        }

        try {
            book.decreaseStock();
        } catch (IllegalStateException e) {
            return new BorrowResult(false, e.getMessage());
        }

        currentBorrowCount++;
        afterBorrowed(book);
        return new BorrowResult(true, "Muon thanh cong: " + book.getTitle());
    }

    private boolean canBorrowMore() {
        return currentBorrowCount < getMaxBorrowLimit();
    }

    protected abstract boolean isBookAllowed(Book book);

    protected abstract String getRejectMessage();

    protected void afterBorrowed(Book book) {
        System.out.println(fullName + " muon: " + book.getTitle());
    }

    public String getReaderId() {
        return readerId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCurrentBorrowCount() {
        return currentBorrowCount;
    }

    public void decreaseBorrowCount() {
        if (currentBorrowCount > 0) {
            currentBorrowCount--;
        }
    }
}
