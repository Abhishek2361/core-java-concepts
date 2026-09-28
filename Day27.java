
   // polymorphism 
      // Polymorphism matlab ek hi naam ka kaam, alag-alag object ke hisaab se alag tarike se perform hona.
        // Types of polymorphism
          // 1. Compile time polymorphism (method overloading)
          // 2. Runtime polymorphism (method overriding)
      
          // Compile time polymorphism (method overloading)
            class Printer {
               void print(String text) {
               System.out.println("Printing text: " + text);
             }
              void print(int number) {
              System.out.println("Printing number: " + number);
             }
            }

           // Runtime polymorphism (method overriding)
            class Animal {
              void sound() {
                System.out.println("Animal makes a sound");
              }
            }

            class Dog extends Animal {
              @Override
              void sound() {
                System.out.println("Dog barks");
              }
            }

            class Cat extends Animal {
              @Override
              void sound() {
                System.out.println("Cat meows");
              }
            } 


         // Dynamic Method Dispatch : Dynamic Method Dispatch matlab overridden method ka call compile time pe nahi, runtime pe decide hota hai — reference type nahi, actual object dekh kar JVM method chunti hai.
              
            class DeliveryBoy{
              void deliver() {
                System.out.println("Delivering the package");
              }
            }
            class BikeDeliveryBoy extends DeliveryBoy {
              @Override
              void deliver() {
                System.out.println("Bike se 10 minute me deliver karenge");
              }
            }
            class CycleDeliveryBoy extends DeliveryBoy {
              @Override
              void deliver() {
                System.out.println("Cycle se 30 minute me deliver karenge");
              }
            }
public class Day27 {
  public static void main(String[] args) {


    // Example of compile time polymorphism (method overloading)
     Printer printer = new Printer();
     printer.print("Hello, World!"); // Calls the print method with a String argument
     printer.print(42); // Calls the print method with an int argument

     // Example of runtime polymorphism (method overriding)
     Animal myDog = new Dog();
     Animal myCat = new Cat();

     myDog.sound(); // Calls the sound method of the Dog class
     myCat.sound(); // Calls the sound method of the Cat class


     // Example of dynamic method dispatch
     DeliveryBoy d ; // reference Parent class ka hai
     d = new BikeDeliveryBoy(); // actual object BikeDeliveryBoy ka hai
     d.deliver(); // bike se 10 minute me deliver karenge
     d = new CycleDeliveryBoy(); // actual object CycleDeliveryBoy ka hai
      d.deliver(); // cycle se 30 minute me deliver karenge


  }
}

