package assignment.asm2.bai1;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Dac Nhan Tam", "Dale Carnegie", 1936, 120000);
        Book b3 = new Book("Toi thay hoa vang tren co xanh", "Nguyen Nhat Anh");

        b2.applyDiscount(10);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}