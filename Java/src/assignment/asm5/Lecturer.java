package assignment.asm5;

public class Lecturer extends Reader {
    private String department;

    public Lecturer(String readerId, String fullName, String email, String department) {
        super(readerId, fullName, email);
        this.department = department;
    }

    @Override
    public int getMaxBorrow() {
        return 5;
    }

    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * 1000;
    }

    @Override
    public String getInfo() {
        return "[GV] " + getReaderId()
                + " | " + getFullName()
                + " | Email: " + getEmail()
                + " | Khoa: " + department
                + " | Han muon: " + getMaxBorrow() + " cuon";
    }
}