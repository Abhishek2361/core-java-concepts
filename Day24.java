
    // Inheritance - A mechanism in which one class(child/subclass) acquires the properties and methods of another class(parent/superclass).

    // Single Inheritance - A subclass inherits from a single superclass.
    class Parent {
        void displayParent() {
            System.out.println("This is the parent class");
        }
    }

    class Child extends Parent {
        void displayChild() {
            System.out.println("This is the child class");
        }
    }

    //Multilavel Inheritance - A subclass inherits from a superclass, and then another subclass inherits from that subclass.
    class GrandChild extends Child {
        void displayGrandChild() {
            System.out.println("This is the grandchild class");
        }
    }


    // A final and Large example of Inheritance in Java
    class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }
    class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is weeping");
        }
    }
    class Cat extends Animal {
        void meow() {
            System.out.println("Cat is meowing");
        }
    }
    class Kitten extends Cat {
        void purr() {
            System.out.println("Kitten is purring");
        }
    }
    class Bird extends Animal {
        void chirp() {
            System.out.println("Bird is chirping");
        }
    }class Parrot extends Bird {
        void talk() {
            System.out.println("Parrot is talking");
        }
    }
      




public class Day24 {
  public static void main(String[] args) {
  
   /* 
    // Single Inheritance example
    Child child = new Child();
    child.displayParent(); // Inherited method from Parent class
    child.displayChild();  // Method from Child class

    // Multilevel Inheritance example
    GrandChild grandChild = new GrandChild();
    grandChild.displayParent();      // Inherited method from Parent class
    grandChild.displayChild();       // Inherited method from Child class
    grandChild.displayGrandChild();  // Method from GrandChild class
    */



    // Final and Large example of Inheritance in Java
    Puppy puppy = new Puppy();
    puppy.eat();  // Inherited method from Animal class
    puppy.bark(); // Inherited method from Dog class
    puppy.weep(); // Method from Puppy class
    Kitten kitten = new Kitten();
    kitten.eat();  // Inherited method from Animal class
    kitten.meow(); // Inherited method from Cat class
    kitten.purr(); // Method from Kitten class
    Parrot parrot = new Parrot();
    parrot.eat();  // Inherited method from Animal class
    parrot.chirp(); // Inherited method from Bird class
    parrot.talk(); // Method from Parrot class
  }
}
