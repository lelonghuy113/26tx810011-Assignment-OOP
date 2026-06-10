package assignment.asm6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Reader student = new StudentReader(
                "DG01",
                "Nguyen Van A",
                "a@student.edu",
                "CNTT01",
                12
        );

        Reader faculty = new FacultyReader(
                "DG02",
                "Tran Thi B",
                "b@uni.edu",
                "Cong nghe thong tin",
                12
        );

        Reader senior = new SeniorReader(
                "DG03",
                "Le Van C",
                "c@email.com",
                "CC2024001",
                24
        );

        Reader guest = new GuestReader(
                "DG04",
                "Pham Van D",
                "guest@email.com"
        );

        library.addReader(student);
        library.addReader(faculty);
        library.addReader(senior);
        library.addReader(guest);

        library.printAllReaders();

        System.out.println();

        double totalFee = library.calculateTotalLateFee(7);
        System.out.printf("Tong tien phat neu tre 7 ngay: %,.0f VND%n", totalFee);

        System.out.println();

        Reader found = library.findReaderByName("van");
        if (found != null) {
            System.out.println("Tim thay: " + found.getInfo());
        } else {
            System.out.println("Khong tim thay doc gia.");
        }

        System.out.println();

        library.printSeniorReaders();

        System.out.println();

        /*
         * Phân tích LSP:
         *
         * Nếu đặt renewCard(int months) trực tiếp trong Reader,
         * chương trình sẽ hiểu rằng mọi Reader đều có thể gia hạn thẻ.
         *
         * Tuy nhiên GuestReader là độc giả khách vãng lai, chỉ đọc tại chỗ
         * và không có thẻ thư viện để gia hạn.
         *
         * Nếu GuestReader phải override renewCard() bằng cách throw exception,
         * thì GuestReader không thể thay thế Reader một cách an toàn.
         * Điều này vi phạm nguyên lý LSP.
         *
         * Cách sửa: tách Reader thành Reader và CardReader.
         * Chỉ các loại độc giả có thẻ như StudentReader, FacultyReader,
         * SeniorReader mới kế thừa CardReader.
         */

        List<Reader> readers = new ArrayList<>();
        readers.add(student);
        readers.add(faculty);
        readers.add(senior);
        readers.add(guest);

        printFeeReport(readers, 7);
    }

    public static void printFeeReport(List<Reader> readers, int daysLate) {
        System.out.println("===== FEE REPORT =====");

        for (Reader reader : readers) {
            System.out.printf("%-25s | Fee: %,.0f VND%n",
                    reader.getFullName(),
                    reader.calculateLateFee(daysLate));
        }
    }
}