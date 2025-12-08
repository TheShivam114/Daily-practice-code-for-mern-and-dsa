/*1. Inheritance – Employee & Manager

Create a base class Employee with:

name

salary

method: display()

Create a derived class Manager with:

department

override display()

In main, print details of both Employee and Manager using the same function reference (dynamic polymorphism). */



    // Base Class
    class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }

    // Derived Class
    class Manager extends Employee {
        String department;

        Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }

        @Override
        void display() {
            System.out.println("Manager Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Department: " + department);
        }
    }

    public class oops_day8  {
        public static void main(String[] args) {
            Employee e1 = new Employee("Rahul", 40000);
            Employee e2 = new Manager("Amit", 70000, "Sales");

            // Calling display()
            e1.display();
            System.out.println();
            e2.display(); // Calls Manager's display() due to polymorphism
        }
    }
 

