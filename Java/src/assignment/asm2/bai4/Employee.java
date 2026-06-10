package assignment.asm2.bai4;

public class Employee {
    private int id;
    private String name;
    private double salary;

    private static int employeeCount = 0;
    private static int nextId = 1000;
    public static String companyName = "TechCorp";
    private static double totalSalary = 0;

    public Employee(String name, double salary) {
        this.id = nextId;
        nextId++;

        this.name = name;
        this.salary = salary;

        employeeCount++;
        totalSalary = totalSalary + salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Ten khong hop le");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            totalSalary = totalSalary - this.salary + salary;
            this.salary = salary;
        } else {
            System.out.println("Luong khong hop le");
        }
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double newSalary = salary + salary * percent / 100;
            setSalary(newSalary);
        } else {
            System.out.println("Phan tram tang luong khong hop le");
        }
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static double getTotalSalary() {
        return totalSalary;
    }

    public static double getAverageSalary() {
        if (employeeCount == 0) {
            return 0;
        }
        return totalSalary / employeeCount;
    }

    public static void changeCompanyName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            companyName = newName;
        } else {
            System.out.println("Ten cong ty khong hop le");
        }
    }
}