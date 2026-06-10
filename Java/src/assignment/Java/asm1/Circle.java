package assignment.asm1;

public class Circle {
    double radius;

    public double area() {
        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        circles[0] = new Circle();
        circles[0].radius = 1.5;

        circles[1] = new Circle();
        circles[1].radius = 2;

        circles[2] = new Circle();
        circles[2].radius = 3;

        circles[3] = new Circle();
        circles[3].radius = 4;

        circles[4] = new Circle();
        circles[4].radius = 5;

        double totalArea = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Hinh tron " + (i + 1));
            System.out.println("Ban kinh: " + circles[i].radius);
            System.out.println("Dien tich: " + circles[i].area());
            System.out.println("Chu vi: " + circles[i].circumference());
            System.out.println();

            totalArea = totalArea + circles[i].area();
        }

        System.out.println("Tong dien tich: " + totalArea);
    }
}
