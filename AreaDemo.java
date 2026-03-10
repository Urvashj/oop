class Shape{
    double d1, d2;

    void getData(double x, double y) {
        d1 = x;
        d2 = y;
    }
}

class Triangle extends Shape {
    double findArea() {
        double a = 0.5 * d1 * d2;
        return a;
    }
}

class Rectangle extends Shape {
    double findArea() {
        double a = d1 * d2;
        return a;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.getData(6, 3);
        System.out.println("Area of Triangle = " + t1.findArea());

        Rectangle r1 = new Rectangle();
        r1.getData(6, 3);
        System.out.println("Area of Rectangle = " + r1.findArea());
    }
}