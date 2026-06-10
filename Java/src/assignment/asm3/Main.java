package assignment.asm3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.themSach(new Book("B01", "Mat biec", "Nguyen Nhat Anh", 1990, 3));
        library.themSach(new Book("B02", "Truyen Kieu", "Nguyen Du", 1820, 2));
        library.themSach(new Book("B03", "Binh Ngo dai cao", "Nguyen Trai", 1428, 1));
        library.themSach(new Book("B04", "Lac Long Quan - Au Co", "Dan gian Viet Nam", 2020, 4));
        library.themSach(new Book("B05", "Thanh Giong", "Dan gian Viet Nam", 2019, 5));
        library.themSach(new Book("B06", "Son Tinh - Thuy Tinh", "Dan gian Viet Nam", 2021, 3));
        library.themSach(new Book("B07", "Chi Pheo", "Nam Cao", 1941, 2));
        library.themSach(new Book("B08", "Tat den", "Ngo Tat To", 1939, 4));
        library.themSach(new Book("B09", "So do", "Vu Trong Phung", 1936, 2));
        library.themSach(new Book("B10", "Vo Nhat", "Kim Lan", 1962, 3));
        library.themSach(new Book("B11", "Canh dong bat tan", "Nguyen Ngoc Tu", 2005, 2));

        library.themDocGia(new Reader("DG01", "Nguyen Van Test", "nguyenvantest@gmail.com", "SINH_VIEN"));
        library.themDocGia(new Reader("DG02", "Le Long Test", "lelongtest@gmail.com", "GIANG_VIEN"));

        Scanner sc = new Scanner(System.in);
        int chon;

        while (true) {
            System.out.println("\n===== HE THONG QUAN LY THU VIEN =====");
            System.out.println("1. Tim kiem sach theo ten hoac tac gia");
            System.out.println("2. Tao phieu muon sach");
            System.out.println("3. Tra sach va tinh phat");
            System.out.println("4. Xem danh sach phieu muon qua han");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            sc.nextLine();

            if (chon == 1) {
                System.out.print("Nhap tu khoa tim kiem: ");
                String kw = sc.nextLine();
                library.timKiemSach(kw);
            } else if (chon == 2) {
                System.out.print("Nhap ma phieu: ");
                String mp = sc.nextLine();
                System.out.print("Nhap ma doc gia: ");
                String mdg = sc.nextLine();
                System.out.print("Nhap ma sach: ");
                String ms = sc.nextLine();
                System.out.print("Nhap ngay muon (dang so nguyen): ");
                int nm = sc.nextInt();
                System.out.print("Nhap ngay hen tra (dang so nguyen): ");
                int nht = sc.nextInt();
                library.muonSach(mp, mdg, ms, nm, nht);
            } else if (chon == 3) {
                System.out.print("Nhap ma phieu muon can tra: ");
                String mp = sc.nextLine();
                System.out.print("Nhap ngay tra thuc te (dang so nguyen): ");
                int nttt = sc.nextInt();
                library.traSach(mp, nttt);
            } else if (chon == 4) {
                System.out.print("Nhap ngay hien tai gia dinh: ");
                String input = sc.next();
                int nhtai = Integer.parseInt(input);
                library.inPhieuQuaHan(nhtai);
            } else if (chon == 0) {
                System.out.println("Da thoat chuong trinh.");
                break;
            } else {
                System.out.println("Lua chon khong hop le!");
            }
        }
        sc.close();
    }
}