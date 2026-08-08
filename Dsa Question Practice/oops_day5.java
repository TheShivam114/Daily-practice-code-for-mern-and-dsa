/*Problem: Employee Bonus Calculation

You are required to design a program using object-oriented programming.

Task:

Create a class Employee with the following attributes:

String name

double salary

The class must include:

A parameterized constructor to initialize name and salary.

A method calculateBonus() that returns the bonus.

Bonus = 10% of salary

In the main method:
Read employee name and salary.
Create an object of Employee.

Print the bonus.

Input Format:
<name>
<salary>

Output Format:
Bonus: <bonus> */
import java.util.*;
public class oops_day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();

        Employee e = new Employee(name, salary);
        System.out.println("Bonus: " + e.calculateBonus());
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
}
    
