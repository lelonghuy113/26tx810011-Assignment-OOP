package assignment.asm3;

public class Reader {
    private String maDocGia;
    private String hoTen;
    private String email;
    private String loaiThe;

    public Reader(String maDocGia, String hoTen, String email, String loaiThe) {
        this.maDocGia = maDocGia;
        this.hoTen = hoTen;
        this.email = email;
        this.loaiThe = loaiThe;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiThe() {
        return loaiThe;
    }

    public void setLoaiThe(String loaiThe) {
        this.loaiThe = loaiThe;
    }
}