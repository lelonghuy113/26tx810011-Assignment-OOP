package assignment.asm2.bai2;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double side) {
        width = side;
        height = side;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public boolean isSquare() {
        return width == height;
    }

    public void scale(double factor) {
        if (factor > 0) {
            width = width * factor;
            height = height * factor;
        } else {
            System.out.println("He so khong hop le");
        }
    }
}