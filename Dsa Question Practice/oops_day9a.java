/*2. Multilevel Inheritance – Animal → Mammal → Dog

Create classes:

Animal:

method: eat()

Mammal extends Animal:

method: walk()

Dog extends Mammal:

method: bark()

In main call all three methods using Dog object. */

   
    class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Derived Class 1
    class Mammal extends Animal {
        void walk() {
            System.out.println("Mammal is walking");
        }
    }

    // Derived Class 2
    class Dog extends Mammal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    public class oops_day9a{
        public static void main(String[] args) {
            Dog d = new Dog();

            d.eat(); // from Animal
            d.walk(); // from Mammal
            d.bark(); // from Dog
        }
    }


