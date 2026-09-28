 
    // Multiple Inheritance + Method Overriding
       // Multiple Inheritance -Multiple Inheritance is a mechanism in which one class can inherit properties and methods from multiple classes. It helps in code reusability.
    
       // example of Multiple Inheritance i n Java using Interfaces:
     /* 
       interface Father {
    void driving();
}

interface Mother {
    void cooking();
}

class Child implements Father, Mother {

    public void driving() {
        System.out.println("Child can drive");
    }

    public void cooking() {
        System.out.println("Child can cook");
    }
}
    */
       
 //Metod Overriding - Method overriding means a child class provides its own implementation of a method that is already defined in the interface.

     // example of Method Overriding in java
        interface Animal {
            void sound();
        }

        class Dog implements Animal {
            public void sound() {
                System.out.println("Dog barks");
            }
        } 
        class Cat implements Animal {
            public void sound() {
                System.out.println("Cat meows");
            }
        }

 

        


public class Day25 {
  
    public static void main(String[] args) {
       
       /*
         // Multiple Inheritance Example
        Child child = new Child();
        child.driving();
        child.cooking();
        */

        // Method Overriding Example
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
        Cat cat = new Cat();
        cat.sound(); // Output: Cat meows


    }
     
}
