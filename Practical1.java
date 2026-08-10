class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
}

class Quadrilateral {
    private final Point point1;
    private final Point point2;
    private final Point point3;
    private final Point point4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        this.point4 = p4;
    }

    public Point getPoint1() { return point1; }
    public Point getPoint2() { return point2; }
    public Point getPoint3() { return point3; }
    public Point getPoint4() { return point4; }
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double calculateArea() {
        double base1 = Math.abs(getPoint1().getX() - getPoint2().getX());
        double base2 = Math.abs(getPoint3().getX() - getPoint4().getX());
        double height = Math.abs(getPoint1().getY() - getPoint3().getY());
        return (base1 + base2) * height / 2.0;
    }
}

class Rectangle extends Quadrilateral {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public double calculateArea() {
        double length = Math.abs(getPoint1().getX() - getPoint2().getX());
        double width = Math.abs(getPoint2().getY() - getPoint3().getY());
        return length * width;
    }
}

class Square extends Rectangle {
    private final double sideLength;

    public Square(Point p1, double sideLength) {
        super(
            p1,
            new Point(p1.getX() + sideLength, p1.getY()),
            new Point(p1.getX() + sideLength, p1.getY() + sideLength),
            new Point(p1.getX(), p1.getY() + sideLength)
        );
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        Square square = new Square(p1, 3);

        System.out.println("Area of trapezoid="+trapezoid.calculateArea());
        System.out.println("Area of rectangle="+rectangle.calculateArea());
        System.out.println("Area of square="+square.calculateArea());
    }
}