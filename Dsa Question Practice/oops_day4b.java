/*Student Grade Finder

Create a class Student with:
String name
int marks

Requirements:
Create a parameterized constructor.

Method getGrade() returns:
'A' if marks > 90
'B' if marks > 75
'C' otherwise
In the main method:
Read a student’s name and marks.
Create an object.
Print the grade returned by getGrade().

Input Format:
<name>
<marks>

Output Format:
Grade: <A/B/C>
*/
import java.util.*;
public class oops_day4b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter maks");
        int marks = sc.nextInt();

        Student s = new Student(name, marks);
        System.out.println("Grade: " + s.getGrade());
    }
}

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    char getGrade() {
        if (marks > 90)
            return 'A';
        else if (marks > 75)
            return 'B';
        else
            return 'C';
    }
}


