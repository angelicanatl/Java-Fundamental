// Angelica Natalie
// Assignment 3
// 5. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate thearea and perimeter of a circle.

package A3;

public class Soal5 {
    public static void main(String[] args) {
        Circle cir = new Circle(21.0);
        System.out.println("Area of circle = " + cir.getArea());
        System.out.println("Perimeter of circle = " + cir.getPerimeter());
    }
}

class Shape {
    public double getArea() {
        throw new UnsupportedOperationException("Must be overriden by subclass.");
    }

    public double getPerimeter() {
        throw new UnsupportedOperationException("Must be overriden by subclass.");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}