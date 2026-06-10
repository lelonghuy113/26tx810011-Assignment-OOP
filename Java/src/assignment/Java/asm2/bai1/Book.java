package assignment.asm2.bai1;

public class Book {
    String title;
    String author;
    int year;
    double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        year = 2000;
        price = 0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 2026;
        this.price = 100000;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price = price - price * percent / 100;
        } else {
            System.out.println("Phan tram giam gia khong hop le");
        }
    }

    public void displayInfo() {
        System.out.println("Sach: " + title + " - Tac gia: " + author + " - Nam: " + year + " - Gia: " + price);
    }
}