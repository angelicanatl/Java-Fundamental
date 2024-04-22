// Angelica Natalie
// Assignment 3
// 4. Write a Java program to create a class called Shape with a method called getArea(). Create a subclasscalled Rectangle that overrides the getArea() method to calculate the area of a rectangle

package A3;

public class Soal4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(8.0, 5.0);
        System.out.println("Area of rectangle = " + rec.getArea());
    }

}

class Shape {
    public double getArea() {
        throw new UnsupportedOperationException("Must be overriden by subclass.");
    }
}

class Rectangle extends Shape {
    double panjang;
    double lebar;

    public Rectangle(double p, double l) {
        this.panjang = p;
        this.lebar = l;
    }

    @Override
    public double getArea() {
        return this.panjang * this.lebar;
    }
}