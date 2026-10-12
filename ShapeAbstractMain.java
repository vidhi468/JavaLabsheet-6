// Q7: Abstract Shape with Circle and Triangle subclasses
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double heightToA;

    Triangle(double sideA, double sideB, double sideC, double heightToA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightToA = heightToA;
    }

    @Override
    double calculateArea() {
        return 0.5 * sideA * heightToA;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class ShapeAbstractMain {
    public static void main(String[] args) {
        Shape circle = new Circle(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0, 4.0);
        System.out.printf("Circle area: %.2f%n", circle.calculateArea());
        System.out.printf("Circle perimeter: %.2f%n", circle.calculatePerimeter());
        System.out.printf("Triangle area: %.2f%n", triangle.calculateArea());
        System.out.printf("Triangle perimeter: %.2f%n", triangle.calculatePerimeter());
    }
}
