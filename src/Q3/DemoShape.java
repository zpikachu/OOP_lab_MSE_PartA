/*
  3) Write a Java program to create a class called Shape with methods
 called getPerimeter() and getArea(). Create a subclass called Circle,
 Rectangle, and Triangle that overrides the getPerimeter() and getArea()
 methods to calculate the area and perimeter of all the subclasses.
 */
package Q3;

abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getPerimeter method to calculate perimeter of a circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override getArea method to calculate area of a circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getPerimeter method to calculate perimeter of a rectangle
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Override getArea method to calculate area of a rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double base;
    private double height;

    // Constructor to initialize sides and height for perimeter and area calculation
    public Triangle(double sideA, double sideB, double sideC, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.base = base;
        this.height = height;
    }

    // Override getPerimeter method to calculate perimeter of a triangle
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Override getArea method to calculate area of a triangle
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class DemoShape {
    public static void main(String[] args) {
        // Create instances of each shape
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5, 4, 3);

        // Display perimeter and area of each shape
        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        System.out.println("\nRectangle:");
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());

        System.out.println("\nTriangle:");
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Area: " + triangle.getArea());
    }
}
