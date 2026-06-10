package assignment.asm7;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int stock;
    private boolean referenceOnly;

    public Book(String bookId, String title, String author, int stock, boolean referenceOnly) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.referenceOnly = referenceOnly;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public boolean isReferenceOnly() {
        return referenceOnly;
    }

    public void decreaseStock() {
        if (stock <= 0) {
            throw new IllegalStateException("Sach da het ton kho");
        }
        stock--;
    }

    public void increaseStock() {
        stock++;
    }

    public String getInfo() {
        return String.format("%s - %s, tac gia: %s, ton kho: %d, tham khao tai cho: %s",
                bookId, title, author, stock, referenceOnly ? "Co" : "Khong");
    }
}
