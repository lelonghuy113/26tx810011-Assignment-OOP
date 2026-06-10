package assignment.asm7;
import assignment.asm7.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Reader> readers;
    private List<Book> books;
    private List<BorrowSlip> slips;
    private LateFeePolicy feePolicy;

    public Library() {
        readers = new ArrayList<>();
        books = new ArrayList<>();
        slips = new ArrayList<>();
        feePolicy = new StandardFeePolicy();
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addBorrowSlip(BorrowSlip slip) {
        slips.add(slip);
    }

    public void removeBorrowSlip(BorrowSlip slip) {
        slips.remove(slip);
    }

    public void setFeePolicy(LateFeePolicy policy) {
        this.feePolicy = policy;
        System.out.println("Cap nhat chinh sach phi phat: " + policy.getPolicyName());
    }

    public double calculateTotalFee(int daysLate) {
        double total = 0;
        for (Reader r : readers) {
            double baseFee = r.calculateLateFee(daysLate);
            double adjustedFee = feePolicy.applyPolicy(baseFee);
            System.out.printf("  %-20s | Base: %6.0f | Sau CS: %6.0f VND%n",
                    r.getFullName(), baseFee, adjustedFee);
            total += adjustedFee;
        }
        System.out.printf("Tong phi phat (%s): %.0f VND%n", feePolicy.getPolicyName(), total);
        return total;
    }

    public void printBorrowSlips() {
        System.out.println("\n=== DANH SACH PHIEU MUON ===");
        if (slips.isEmpty()) {
            System.out.println("Chua co phieu muon nao.");
            return;
        }
        for (BorrowSlip slip : slips) {
            System.out.println(slip.getInfo());
        }
    }

    public List<BorrowSlip> getSlips() {
        return slips;
    }
}

/*
PHAN TICH THIET KE

1. Quan he Composition trong he thong

Library HAS-A List<Reader>: thu vien quan ly nhieu doc gia, nhung Library khong phai la Reader.
Dung Composition vi danh sach doc gia la du lieu ma thu vien nam giu va quan ly.

Library HAS-A List<Book>: thu vien quan ly nhieu sach, nhung Library khong phai la Book.
Dung Composition vi sach la tai nguyen thuoc he thong quan ly cua thu vien.

Library HAS-A List<BorrowSlip>: thu vien luu cac phieu muon de theo doi qua trinh muon tra sach.
Dung Composition vi phieu muon la du lieu phat sinh trong qua trinh hoat dong cua thu vien.

Library HAS-A LateFeePolicy: thu vien co mot chinh sach tinh phi phat hien tai.
Dung Composition vi thu vien co the thay doi chinh sach tinh phi ma khong can sua logic cua Reader hay Library.

BorrowSlip HAS-A Reader: moi phieu muon gan voi mot doc gia cu the.
Dung Composition vi phieu muon can biet ai dang muon sach, nhung phieu muon khong phai la doc gia.

BorrowSlip HAS-A Book: moi phieu muon gan voi mot sach cu the.
Dung Composition vi phieu muon can biet sach nao dang duoc muon, nhung phieu muon khong phai la sach.

Librarian HAS-A Library: thu thu lam viec voi thu vien de xu ly muon tra sach.
Dung Composition vi thu thu khong phai la thu vien, ma chi su dung Library de thuc hien nghiep vu.

2. Quan he Inheritance trong he thong

StudentReader IS-A Reader: sinh vien la mot loai doc gia.
Ke thua hop ly vi StudentReader co day du dac diem va hanh vi chung cua Reader, dong thoi co quy dinh rieng khi muon sach.

FacultyReader IS-A Reader: giang vien la mot loai doc gia.
Ke thua hop ly vi FacultyReader cung la doc gia, co the muon sach va co cach tinh phi phat rieng.

SeniorReader IS-A Reader: nguoi cao tuoi la mot loai doc gia.
Ke thua hop ly vi SeniorReader van la doc gia, nhung co chinh sach mien phi phat va co the co hanh vi rieng sau khi muon sach.

StandardFeePolicy IS-A LateFeePolicy: day la mot cach ap dung chinh sach phi phat.
Ke thua interface hop ly vi lop nay cung cap cach tinh phi tieu chuan.

CharityFeePolicy IS-A LateFeePolicy: day la mot cach ap dung chinh sach phi phat.
Ke thua interface hop ly vi lop nay cung cap cach tinh phi giam 50%.

WaivedFeePolicy IS-A LateFeePolicy: day la mot cach ap dung chinh sach phi phat.
Ke thua interface hop ly vi lop nay cung cap cach mien phi phat.

3. Diem co the cai thien

He thong hien tai dang luu ngay muon va ngay tra du kien bang String trong BorrowSlip.
Cach nay don gian nhung chua tot vi kho so sanh ngay thang va de phat sinh loi khi dinh dang ngay khong thong nhat.
Co the cai thien bang cach dung LocalDate cua Java de tinh so ngay tre han ro rang va chinh xac hon.

Ngoai ra, Reader hien chi luu currentBorrowCount va tang khi muon sach thanh cong.
Khi tra sach, he thong nen giam lai currentBorrowCount de phan anh dung so sach doc gia dang muon.
Co the them method returnBook() hoac decreaseBorrowCount() trong Reader va goi khi thu thu xu ly tra sach.
*/