package assignment.asm2.bai4;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("An", 8000000);
        Employee e2 = new Employee("Binh", 9000000);
        Employee e3 = new Employee("Chi", 10000000);

        System.out.println("ID e1: " + e1.getId());
        System.out.println("ID e2: " + e2.getId());
        System.out.println("ID e3: " + e3.getId());

        System.out.println("Tong nhan vien: " + Employee.getEmployeeCount());
        System.out.println("Tong luong: " + Employee.getTotalSalary());
        System.out.println("Luong trung binh: " + Employee.getAverageSalary());

        e2.setSalary(12000000);

        System.out.println();
        System.out.println("Sau khi doi luong e2:");
        System.out.println("Tong luong: " + Employee.getTotalSalary());
        System.out.println("Luong trung binh: " + Employee.getAverageSalary());

        e3.raiseSalary(10);

        System.out.println();
        System.out.println("Sau khi tang luong e3:");
        System.out.println("Tong luong: " + Employee.getTotalSalary());

        Employee.changeCompanyName("NewTech");
        System.out.println("Ten cong ty: " + Employee.companyName);
    }
}