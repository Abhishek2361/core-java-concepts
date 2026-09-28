
  // this keyword + Constructor
     
     // this Keyword: In java , this Keyword is a reference variable that refers to the current object. It is used to differentiate between instance variables and local variables when they have the same name. It can also be used to invoke current class methods, constructors, and pass the current object as an argument to another method.

     // practical Example for this Keyword
     /* 
     class Person {
      String name; // Instance variable
      int age;     // Instance variable

      void setDetails(String name, int age) {
        
          this.name = name; // 'this' differentiates between instance variable and parameter
          this.age = age;   // 'this' differentiates between instance variable and parameter
      }

      String data = "";

       Person addData(String value) {
        this.data += value;
        return this;   // current object return karna, chaining ke liye
    }
     }
    */

     // Constructor: A constructor is a special method in Java that is used to initialize objects. 


     // Final Example for this Keyword + Constructor(parameterized + default) + Constructor Overloading
     class Person {
      String name; // Instance variable
      int age;     // Instance variable

      // Default constructor
      Person() {
          this.name = "Unknown";
          this.age = 0;
      }

      // Parameterized constructor
      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      // Method to display person details
      void display() {
          System.out.println("Name: " + name + ", Age: " + age);
      }
      // Constructor overloading example
      Person(String name) {
          this.name = name;
          this.age = 0; // Default age
      }
    }

public class Day22 {
    public static void main(String[] args) {

        // Using default constructor
        Person person1 = new Person();
        person1.display(); // Output: Name: Unknown, Age: 0

        // Using parameterized constructor
        Person person2 = new Person("Abhishek", 21);
        person2.display(); // Output: Name: Abhishek, Age: 21

        // Using overloaded constructor
        Person person3 = new Person("Rahul");
        person3.display(); // Output: Name: Rahul, Age: 0
    }

}
