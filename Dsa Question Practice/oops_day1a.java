/*Basic Calculator Using Class

You must design a simple calculator using object-oriented programming.

Task:
Create a class Calculator with the following methods:
int add(int a, int b) → returns the sum

int subtract(int a, int b) → returns the difference
In the main method:
Read two integers.
Create a Calculator object.

Print the result of addition and subtraction.

Input Format:
a b
Output Format:
Addition: <sum>
Subtraction: <difference> */
import java.util.*;
public class oops_day1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter a number a");
        int a = sc.nextInt();
        System.out.println("enter a number b");
        int b = sc.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

