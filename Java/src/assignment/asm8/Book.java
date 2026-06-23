package assignment.asm8;

public class Book implements Borrowable {

    private String bookId;
    private String title;
    private String author;

    private String borrowerId;
    private String borrowDate;
    private String currentBorrowerId;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public void borrowBy(String readerId, String date) {
        if (!isAvailable()) {
            System.out.println("Book '" + title + "' is not available.");
            return;
        }

        this.currentBorrowerId = readerId;
        this.borrowDate = date;

        System.out.println("Book '" + title + "' borrowed by " + readerId);
    }

    @Override
    public void returnBook(String date) {
        this.currentBorrowerId = null;
        this.borrowDate = null;
    }

    @Override
    public boolean isAvailable() {
        return currentBorrowerId == null;
    }

    @Override
    public String getBorrowerId() {
        return currentBorrowerId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}