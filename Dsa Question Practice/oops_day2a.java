/*You are required to design a program using object-oriented programming.

Task:

Create a class Rectangle with the following attributes:

int length

int width

The class must contain:

A parameterized constructor that initializes both attributes.

A method getArea() that returns the area of the rectangle (length × width).

Input Format:

First line: length

Second line: width

Output Format:

Print the area of the rectangle. */
import java.util.*;
public class oops_day2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("enter length");
        int length = sc.nextInt();
        System.out.println("enter width");
        int width = sc.nextInt();

        Rectangle rect = new Rectangle(length, width);
        System.out.println(rect.getArea());
    }
}

class Rectangle {
    int length;
    int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int getArea() {
        return length * width;
    }
}


