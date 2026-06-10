package assignment.asm4;

public class Student extends Reader {
    private String className;

    public Student(String readerId, String fullName, String email, String className) {
        super(readerId, fullName, email);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int getMaxBorrow() {
        return 3;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Loại độc giả: Sinh viên"
                + " | Lớp: " + className
                + " | Mượn tối đa: " + getMaxBorrow() + " sách";
    }
}