/*Here is a competitive-exam style OOP question for the Person class along with a clean Java solution.
 Competitive Exam OOP Question (Java — Beginner Level)
Problem: Compare Ages of Two Persons
You need to design a program using Object-Oriented Programming.
Task:
Create a class Person with the following attributes:
String name
int age
The class must contain:
A parameterized constructor to initialize the attributes.
A method getAge() that returns the age.
In the main method:
Read input for two persons (name and age).

Create two objects.

Print the name of the person who is older.

If both have the same age, print "Both are of same age".

Input Format:
<name1>
<age1>
<name2>
<age2>
Output Format:

Print the name of the older person, or a message if both have same age. */
import java.util.*;
public class oops_day2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name1");
        String name1 = sc.nextLine();
        System.out.println("age1");
        int age1 = sc.nextInt();
        sc.nextLine(); // newline
        System.out.println("name2");
        String name2 = sc.nextLine();
        System.out.println("age2");
        int age2 = sc.nextInt();
        
        Person p1 = new Person(name1, age1);
        Person p2 = new Person(name2, age2);

        if (p1.age > p2.age) {
            System.out.println(p1.name + " is older");
        } else if (p2.age > p1.age) {
            System.out.println(p2.name + " is older");
        } else {
            System.out.println("Both are of same age");
        }
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }
}


