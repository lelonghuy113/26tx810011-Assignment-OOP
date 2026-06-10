package assignment.asm4;

public class Reader {
    private String readerId;
    private String fullName;
    private String email;

    public Reader(String readerId, String fullName, String email) {
        this.readerId = readerId;
        this.fullName = fullName;
        this.email = email;
    }

    public String getReaderId() {
        return readerId;
    }

    public void setReaderId(String readerId) {
        this.readerId = readerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaxBorrow() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mã độc giả: " + readerId
                + " | Họ tên: " + fullName
                + " | Email: " + email;
    }
}