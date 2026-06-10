package assignment.asm1;

public class Rectangle {
    double width;
    double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public boolean isSquare() {
        if (width == height) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 5;
        r1.height = 8;

        Rectangle r2 = new Rectangle();
        r2.width = 6;
        r2.height = 6;

        System.out.println("Hinh chu nhat 1");
        System.out.println("Dien tich: " + r1.area());
        System.out.println("Chu vi: " + r1.perimeter());
        System.out.println("La hinh vuong: " + r1.isSquare());
        System.out.println();

        System.out.println("Hinh chu nhat 2");
        System.out.println("Dien tich: " + r2.area());
        System.out.println("Chu vi: " + r2.perimeter());
        System.out.println("La hinh vuong: " + r2.isSquare());
    }
}
