/*Problem: Area Calculation Using Interface
You must design a program to compute the area of different shapes using interfaces.
Task:
Create an interface Shape with:
double getArea();
Create two classes:
Circle
Constructor takes radius
Implements getArea() → area = π × radius × radius
Rectangle
Constructor takes length and width
Implements getArea() → area = length × width

In main:
Read input for:
radius

length & width
Create objects of Circle and Rectangle
Print their areas.
Input Format:
<radius>
<length>
<width>

Output Format:
Circle Area: <value>
Rectangle Area: <value> */
import java.util.*;

interface Shape {
    double getArea();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

public class oops_day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = sc.nextDouble();
        System.out.println("enter length");
        double length = sc.nextDouble();
        System.out.println("enter width");
        double width = sc.nextDouble();

        Shape circle = new Circle(radius);
        Shape rectangle = new Rectangle(length, width);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
    
