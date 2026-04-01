class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Quadrilateral {
    Point p1, p2, p3, p4;

    Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
}

class Rectangle extends Quadrilateral {

    Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    double area() {
        double width = Math.abs(p2.x - p1.x);
        double height = Math.abs(p3.y - p2.y);
        return width * height;
    }
}

public class TestQuadrilateral {

    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Rectangle r = new Rectangle(p1, p2, p3, p4);

        System.out.println("Área: " + r.area());
    }
}