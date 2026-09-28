   
   // this() / super(), Naming Convention + Anonymous Object

     // this() - this() is used to call another constructor of the same class

     class Student {
    String name;
    int age;
    // Default constructor
    Student() {
        this("Rahul", 20); // Calling parameterized constructor using this()
    }
  // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
 
}

// super() - super() is used to call the constructor of the parent class

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}  

// Naming Convention - A set of rules used to give proper and meaningful names to classes, variables, methods, and other elements in a program.

class BankAccount {                        // Class → PascalCase

    private double accountBalance;          // Variable → camelCase
    static final double INTEREST_RATE = 0.05;   // Constant → ALL_CAPS

    public double getAccountBalance() {     // Method → camelCase
        return accountBalance;
    }

    public void calculateInterest() {       // Method → camelCase, descriptive verb
        double interest = accountBalance * INTEREST_RATE;
    }
}

 // Anonymous Object - An object created without giving it a reference variable is called an anonymous object.
 class Student_1 {
    void display() {
        System.out.println("Student displayed");
    }
}
 
public class Day23 {

  public static void main(String[] args) {

      // this() example
        Student s = new Student();
        s.display();

      // super() example
        Dog d = new Dog();  

      // Naming Convention example
        BankAccount account = new BankAccount();
        account.calculateInterest();

      // Anonymous Object example
         // Normal object — reference variable ke saath
        Student s1 = new Student();
        s1.display();

        // Anonymous object — koi reference variable nahi
        new Student().display();   // seedha use karke phek diya
    }

    
}
