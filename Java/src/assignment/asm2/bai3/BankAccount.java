package assignment.asm2.bai3;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (balance < 0) {
            this.balance = 0;
            System.out.println("So du ban dau khong hop le, da gan ve 0");
        } else {
            this.balance = balance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.trim().isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("Ten chu tai khoan khong hop le");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Nap tien thanh cong");
        } else {
            System.out.println("So tien nap khong hop le");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Rut tien thanh cong");
        } else {
            System.out.println("So tien rut khong hop le");
        }
    }

    public void transfer(BankAccount other, double amount) {
        if (other != null && amount > 0 && amount <= balance) {
            balance = balance - amount;
            other.balance = other.balance + amount;
            System.out.println("Chuyen tien thanh cong");
        } else {
            System.out.println("Chuyen tien khong thanh cong");
        }
    }

    public void displayInfo() {
        String lastFour;

        if (accountNumber.length() >= 4) {
            lastFour = accountNumber.substring(accountNumber.length() - 4);
        } else {
            lastFour = accountNumber;
        }

        System.out.println("So tai khoan: ****" + lastFour);
        System.out.println("Chu tai khoan: " + ownerName);
        System.out.println("So du: " + balance);
    }
}