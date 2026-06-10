package assignment.asm5;

public class Student extends Reader {
    private String className;

    public Student(String readerId, String fullName, String email, String className) {
        super(readerId, fullName, email);
        this.className = className;
    }

    @Override
    public int getMaxBorrow() {
        return 3;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 2000;
    }

    @Override
    public String getInfo() {
        return "[SV] " + getReaderId()
                + " | " + getFullName()
                + " | Email: " + getEmail()
                + " | Lop: " + className
                + " | Han muon: " + getMaxBorrow() + " cuon";
    }
}