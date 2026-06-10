package assignment.asm5;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("B01", "Mat biec", "Nguyen Nhat Anh", 1990, 3));
        library.addBook(new Book("B02", "Truyen Kieu", "Nguyen Du", 1820, 2));

        Reader student = new Student("DG01", "Nguyen Van A", "a@student.edu", "CNTT01");
        Reader lecturer = new Lecturer("DG02", "Tran Thi B", "b@uni.edu", "Cong nghe thong tin");

        library.addReader(student);
        library.addReader(lecturer);

        library.printBooks();

        System.out.println();

        library.showAllReaders();

        System.out.println();

        library.showLateFees(7);
    }
}