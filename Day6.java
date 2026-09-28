
  // Object Oriented programming (OOPs)

  // class and object : class is a blueprint and object is an instance of class

  /*class Student{

    String name;
    int age;
    void display(){
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
    }
  }

  */

  // Constructor : Constructor is a special type of method which is used to initialize the object of class. It has same name as class name and it does not have return type.

  /*class Car{
    
    String name;
    int speed;

    // default constructor
    Car(){
      name = "BMW";
      speed = 200;
    }

    // parameterized constructor
    Car(String name, int speed){
      this.name = name;
      this.speed = speed;
    }

    void display(){
      System.out.println("Name: " + name);
      System.out.println("Speed: " + speed);
    }
  }
*/

// Constrector Overloading : Constructor overloading is a technique in Java where a class can have multiple constructors with different parameter lists. This allows the creation of objects in different ways, depending on the arguments passed to the constructor.

/*class Animal{
  String name;
  int age;

  // no-argument constructor
  Animal(){
    this("unknown", 0); // calling parameterized constructor
  }
  // 2 - argument constructor
  Animal(String name, int age){
    this.name = name;
    this.age = age;
  }
  // 3 - argument constructor
  Animal(String name, int age, String type){
    this.name = name;
    this.age = age;
    System.out.println("Type: " + type);
  }
} */

  // this keyword : The this keyword in Java is a reference variable that refers to the current object. It is used to differentiate between instance variables and local variables when they have the same name, and it can also be used to call other constructors in the same class.

  class Employee{
    String name;
    int age;

    // no-argument constructor
    Employee(){
      this("unknown", 0); // calling parameterized constructor
    }
    // 2 - argument constructor
    Employee(String name, int age){
      this.name = name;
      this.age = age;
    }
  }



public class Day6 {
  


  public static void main(String args[]){

    

    /*Student s1 = new Student(); // creating object of class Student 
    s1.name = "Abhishek Tomar";
    s1.age = 21;
    s1.display();
    */

    // Constructor : Constructor is a special type of method which is used to initialize the object of class. It has same name as class name and it does not have return type.

    /*Car c1 = new Car(); // default constructor
    c1.display();

    Car c2 = new Car("Audi", 250); // parameterized constructor
    c2.display();
*/


     // Constrector Overloading 

    /*  Animal a1 = new Animal(); // no-argument constructor
     System.out.println("Name: " + a1.name);
     System.out.println("Age: " + a1.age);
     Animal a2 = new Animal("Dog", 5); // 2 - argument constructor
      System.out.println("Name: " + a2.name);
      System.out.println("Age: " + a2.age);
      Animal a3 = new Animal("Cat", 3, "Mammal"); // 3 - argument constructor 
      System.out.println("Name: " + a3.name);
      System.out.println("Age: " + a3.age);
      */

      // This Keyword
      Employee e1 = new Employee(); // no-argument constructor
      System.out.println("Name: " + e1.name);
      System.out.println("Age: " + e1.age);
      





  
  }

}
