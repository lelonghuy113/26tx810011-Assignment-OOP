package assignment.asm2.bai3;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456789", "Nguyen Van A", 1000000);
        BankAccount acc2 = new BankAccount("987654321", "Tran Thi B", 500000);

        acc1.displayInfo();

        acc1.deposit(200000);
        acc1.withdraw(300000);
        acc1.deposit(-50000);
        acc1.withdraw(2000000);

        acc1.transfer(acc2, 400000);

        System.out.println();
        acc1.displayInfo();

        System.out.println();
        acc2.displayInfo();
    }
}
