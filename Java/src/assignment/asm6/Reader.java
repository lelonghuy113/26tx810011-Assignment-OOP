package assignment.asm6;

public abstract class Reader {
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

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return readerId + " | " + fullName + " | Email: " + email;
    }

    public abstract double calculateLateFee(int daysLate);

    public abstract int getMaxBorrowLimit();
}