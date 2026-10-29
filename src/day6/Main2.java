package day6;

abstract class Shape {
    abstract double calculateArea();
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
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Shape firstShape = new Circle(3);
        Shape secondShape = new Rectangle(8, 5);

        System.out.printf("Area of circle: %.2f%n",
                firstShape.calculateArea());

        System.out.printf("Area of rectangle: %.2f%n",
                secondShape.calculateArea());
    }
}
