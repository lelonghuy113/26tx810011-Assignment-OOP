package assignment.asm4;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private int publishYear;
    private int quantity;

    public Book(String bookId, String title, String author, int publishYear, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Mã sách: " + bookId
                + " | Tên sách: " + title
                + " | Tác giả: " + author
                + " | Năm xuất bản: " + publishYear
                + " | Số lượng kho: " + quantity;
    }
}