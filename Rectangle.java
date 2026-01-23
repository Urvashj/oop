import java.util.Scanner;

class Rectangle {
    double width, height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    void getArea() {
        System.out.println("Area of Rectangle: " + (width * height));
    }

    void getPerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (width + height)));
    }

    public static void main(String args[]) {
        Rectangle obj1 = new Rectangle();
        obj1.getArea();
        obj1.getPerimeter();

        Rectangle obj2 = new Rectangle(100, 200);
        obj2.getArea();
        obj2.getPerimeter();
    }
}
