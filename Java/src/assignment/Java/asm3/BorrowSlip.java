package assignment.asm3;

public class BorrowSlip {
    private String maPhieu;
    private Reader docGia;
    private Book sach;
    private int ngayMuon;
    private int ngayHenTra;
    private int ngayTraThucTe;
    private boolean daTra;

    public BorrowSlip(String maPhieu, Reader docGia, Book sach, int ngayMuon, int ngayHenTra) {
        this.maPhieu = maPhieu;
        this.docGia = docGia;
        this.sach = sach;
        this.ngayMuon = ngayMuon;
        this.ngayHenTra = ngayHenTra;
        this.daTra = false;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Reader getDocGia() {
        return docGia;
    }

    public void setDocGia(Reader docGia) {
        this.docGia = docGia;
    }

    public Book getSach() {
        return sach;
    }

    public void setSach(Book sach) {
        this.sach = sach;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayHenTra() {
        return ngayHenTra;
    }

    public void setNgayHenTra(int ngayHenTra) {
        this.ngayHenTra = ngayHenTra;
    }

    public int getNgayTraThucTe() {
        return ngayTraThucTe;
    }

    public void setNgayTraThucTe(int ngayTraThucTe) {
        this.ngayTraThucTe = ngayTraThucTe;
    }

    public boolean isDaTra() {
        return daTra;
    }

    public void setDaTra(boolean daTra) {
        this.daTra = daTra;
    }
}