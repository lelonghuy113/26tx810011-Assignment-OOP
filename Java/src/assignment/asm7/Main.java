package assignment.asm7;

public class Main {
    public static void main(String[] args) {
        runFeePolicyDemo();
        System.out.println("\n----------------------------------------\n");
        runBorrowDemo();
    }

    private static void runFeePolicyDemo() {
        Library library = new Library();

        library.addReader(new StudentReader("SV01", "Nguyen Van A", "SINH_VIEN"));
        library.addReader(new FacultyReader("GV01", "Tran Thi B", "GIANG_VIEN"));
        library.addReader(new SeniorReader("CC01", "Le Van C", "CC2024"));

        System.out.println("=== Thang binh thuong ===");
        library.calculateTotalFee(7);

        library.setFeePolicy(new CharityFeePolicy());
        System.out.println("\n=== Thang tu thien ===");
        library.calculateTotalFee(7);

        library.setFeePolicy(new WaivedFeePolicy());
        System.out.println("\n=== Thang khai truong ===");
        library.calculateTotalFee(7);
    }

    private static void runBorrowDemo() {
        Library library = new Library();
        Librarian librarian = new Librarian("TT01", "Le Thi D", "0904", "Sang", library);

        Reader student = new StudentReader("SV01", "Nguyen Van A", "SV");
        Reader senior = new SeniorReader("CC01", "Le Van C", "CC2024");

        Book normalBook = new Book("B01", "Clean Code", "Robert Martin", 3, false);
        Book referenceBook = new Book("B02", "Design Patterns", "GoF", 2, true);

        library.addReader(student);
        library.addReader(senior);
        library.addBook(normalBook);
        library.addBook(referenceBook);

//        library.addReader(librarian);

        System.out.println("=== Thu thu xu ly sach thuong ===");
        librarian.processLoan(student, normalBook);
        librarian.processLoan(senior, normalBook);

        System.out.println("\n=== Sinh vien muon sach tham khao ===");
        librarian.processLoan(student, referenceBook);

        library.printBorrowSlips();
    }
}
