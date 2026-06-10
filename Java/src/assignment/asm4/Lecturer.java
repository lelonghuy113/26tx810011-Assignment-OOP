package assignment.asm4;

public class Lecturer extends Reader {
    private String department;

    public Lecturer(String readerId, String fullName, String email, String department) {
        super(readerId, fullName, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int getMaxBorrow() {
        return 5;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Loại độc giả: Giảng viên"
                + " | Khoa: " + department
                + " | Mượn tối đa: " + getMaxBorrow() + " sách";
    }
}