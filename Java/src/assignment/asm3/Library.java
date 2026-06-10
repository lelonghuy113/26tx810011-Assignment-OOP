package assignment.asm3;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> dsSach = new ArrayList<>();
    private ArrayList<Reader> dsDocGia = new ArrayList<>();
    private ArrayList<BorrowSlip> dsPhieu = new ArrayList<>();

    public void themSach(Book b) {
        dsSach.add(b);
    }

    public void themDocGia(Reader r) {
        dsDocGia.add(r);
    }

    public Book timSachTheoMa(String ma) {
        for (Book b : dsSach) {
            if (b.getMaSach().equalsIgnoreCase(ma)) {
                return b;
            }
        }
        return null;
    }

    public Reader timDocGiaTheoMa(String ma) {
        for (Reader r : dsDocGia) {
            if (r.getMaDocGia().equalsIgnoreCase(ma)) {
                return r;
            }
        }
        return null;
    }

    public int demSachDangMuon(String maDocGia) {
        int count = 0;
        for (BorrowSlip p : dsPhieu) {
            if (p.getDocGia().getMaDocGia().equalsIgnoreCase(maDocGia) && !p.isDaTra()) {
                count++;
            }
        }
        return count;
    }

    public void muonSach(String maPhieu, String maDocGia, String maSach, int ngayMuon, int ngayHenTra) {
        Reader r = timDocGiaTheoMa(maDocGia);
        Book b = timSachTheoMa(maSach);

        if (r == null || b == null) {
            System.out.println("Loi: Thong tin thieu hoac sai!");
            return;
        }

        if (b.getSoLuong() <= 0) {
            System.out.println("Loi: Sach trong kho da het!");
            return;
        }

        int dangMuon = demSachDangMuon(maDocGia);
        int gioiHan = r.getLoaiThe().equalsIgnoreCase("SINH_VIEN") ? 3 : 5;

        if (dangMuon >= gioiHan) {
            System.out.println("Loi: Doc gia da muon qua so luong cho phep!");
            return;
        }

        b.setSoLuong(b.getSoLuong() - 1);
        BorrowSlip slip = new BorrowSlip(maPhieu, r, b, ngayMuon, ngayHenTra);
        dsPhieu.add(slip);
        System.out.println("Muon sach thanh cong!");
    }

    public void traSach(String maPhieu, int ngayTraThucTe) {
        BorrowSlip phieuTimThay = null;
        for (BorrowSlip p : dsPhieu) {
            if (p.getMaPhieu().equalsIgnoreCase(maPhieu) && !p.isDaTra()) {
                phieuTimThay = p;
                break;
            }
        }

        if (phieuTimThay == null) {
            System.out.println("Loi: Phieu muon khong ton tai hoac da tra roi!");
            return;
        }

        phieuTimThay.setDaTra(true);
        phieuTimThay.setNgayTraThucTe(ngayTraThucTe);

        Book b = phieuTimThay.getSach();
        b.setSoLuong(b.getSoLuong() + 1);

        if (ngayTraThucTe > phieuTimThay.getNgayHenTra()) {
            int soNgayTre = ngayTraThucTe - phieuTimThay.getNgayHenTra();
            int tienPhat = soNgayTre * 5000;
            System.out.println("Tra sach tre han! So ngay tre: " + soNgayTre + ". Tien phat: " + tienPhat + " VND");
        } else {
            System.out.println("Tra sach dung han thanh cong!");
        }
    }

    public void timKiemSach(String keyword) {
        String kw = keyword.toLowerCase();
        boolean timThay = false;
        for (Book b : dsSach) {
            if (b.getTenSach().toLowerCase().contains(kw) || b.getTacGia().toLowerCase().contains(kw)) {
                System.out.println("[" + b.getMaSach() + "] " + b.getTenSach() + " - Tac gia: " + b.getTacGia() + " (Kho: " + b.getSoLuong() + ")");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach nao phu hop.");
        }
    }

    public void inPhieuQuaHan(int ngayHienTai) {
        boolean coPhieu = false;
        for (BorrowSlip p : dsPhieu) {
            if (!p.isDaTra() && ngayHienTai > p.getNgayHenTra()) {
                System.out.println("Ma phieu: " + p.getMaPhieu() + " | Nguoi muon: " + p.getDocGia().getHoTen() + " | Sach: " + p.getSach().getTenSach() + " | Tre: " + (ngayHienTai - p.getNgayHenTra()) + " ngay");
                coPhieu = true;
            }
        }
        if (!coPhieu) {
            System.out.println("Khong co phieu muon nao qua han.");
        }
    }
}
