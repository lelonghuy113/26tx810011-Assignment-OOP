package assignment.asm4;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("B01", "Mắt biếc", "Nguyễn Nhật Ánh", 1990, 3));
        library.addBook(new Book("B02", "Truyện Kiều", "Nguyễn Du", 1820, 2));
        library.addBook(new Book("B03", "Bình Ngô đại cáo", "Nguyễn Trãi", 1428, 1));
        library.addBook(new Book("B04", "Lạc Long Quân - Âu Cơ", "Dân gian Việt Nam", 2020, 4));
        library.addBook(new Book("B05", "Thánh Gióng", "Dân gian Việt Nam", 2019, 5));
        library.addBook(new Book("B06", "Sơn Tinh - Thủy Tinh", "Dân gian Việt Nam", 2021, 3));
        library.addBook(new Book("B07", "Chí Phèo", "Nam Cao", 1941, 2));
        library.addBook(new Book("B08", "Tắt đèn", "Ngô Tất Tố", 1939, 4));
        library.addBook(new Book("B09", "Số đỏ", "Vũ Trọng Phụng", 1936, 2));
        library.addBook(new Book("B10", "Vợ nhặt", "Kim Lân", 1962, 3));
        library.addBook(new Book("B11", "Cánh đồng bất tận", "Nguyễn Ngọc Tư", 2005, 2));

        Student student1 = new Student("DG01", "Nguyễn Văn Test", "minhnguyen@gmail.com", "CNTT01");
        Student student2 = new Student("DG02", "Trần Mai Test", "maianhtran@gmail.com", "CNTT02");

        Lecturer lecturer1 = new Lecturer("DG03", "Lê Hoàng Test", "namle@uni.edu.vn", "Công nghệ thông tin");
        Lecturer lecturer2 = new Lecturer("DG04", "Phạm Thu Test", "hapham@uni.edu.vn", "Kinh tế");

        library.addReader(student1);
        library.addReader(student2);
        library.addReader(lecturer1);
        library.addReader(lecturer2);

        library.printBooks();

        System.out.println();

        library.printReaders();
    }
}