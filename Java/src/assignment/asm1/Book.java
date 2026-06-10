package assignment.asm1;

public class Book {
    String title;
    String author;
    double price;
    boolean inStock;

    public void printInfo() {
        System.out.println("Ten sach: " + title);
        System.out.println("Tac gia: " + author);
        System.out.println("Gia: " + price);
        System.out.println("Con hang: " + inStock);
        System.out.println();
    }

    public void applyDiscount(double percent) {
        price = price - price * percent / 100;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Toan cao cap";
        book1.author = "Nguyen Van A";
        book1.price = 50000;
        book1.inStock = true;

        Book book2 = new Book();
        book2.title = "Lap trinh Java";
        book2.author = "Tran Van B";
        book2.price = 120000;
        book2.inStock = true;

        Book book3 = new Book();
        book3.title = "Dac Nhan Tam";
        book3.author = "Dale Carnegie";
        book3.price = 80000;
        book3.inStock = false;

        System.out.println("Thong tin ban dau:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        book1.applyDiscount(10);
        book2.applyDiscount(10);
        book3.applyDiscount(10);

        System.out.println("Thong tin sau khi giam gia 10%:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
