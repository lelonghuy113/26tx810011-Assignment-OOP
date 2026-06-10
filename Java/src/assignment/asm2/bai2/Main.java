package assignment.asm2.bai2;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);
        Rectangle r4 = new Rectangle(r3);

        r3.scale(2);

        printRectangle(r1);
        printRectangle(r2);
        printRectangle(r3);
        printRectangle(r4);
    }

    public static void printRectangle(Rectangle r) {
        System.out.println("Dien tich: " + r.getArea());
        System.out.println("Chu vi: " + r.getPerimeter());
        System.out.println("La hinh vuong: " + r.isSquare());
        System.out.println();
    }
}