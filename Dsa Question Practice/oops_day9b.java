/*3. Inheritance + super Keyword

Create class A with:

variable x = 10

method display()

Create class B extends A with:

variable x = 20

method display() that prints both parent and child variables using super.x. */

    // Parent class
    class A {
        int x = 10;

        void display() {
            System.out.println("Value of x in A (parent): " + x);
        }
    }

    // Child class
    class B extends A {
        int x = 20;

        @Override
        void display() {
            System.out.println("Value of x in B (child): " + x);
            System.out.println("Value of x in A (parent) using super.x: " + super.x);
        }
    }

    public class oops_day9b{
        public static void main(String[] args) {
            B obj = new B();
            obj.display();
        }
    }


