
// Encapsulation + Getter/Setters

// Encapsulation - concept + need
// Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) that involves bundling the data (attributes) and methods (functions) that operate on the data into a single unit, typically a class. It restricts direct access to some of an object's components, which can prevent the accidental modification of data.

/*class BankAccount {
  private double balance; // Private variable - bahar sa direct access nahi kar sakte

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("Invalid deposit amount");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Invalid withdrawal amount");
    }
  }

  public double getBalance() {
    return balance;
  }
}
  */
   

// Getter - A method that allows you to retrieve the value of a private variable from outside the class. It provides read-only access to the variable.

// Setter - A method that allows you to set or update the value of a private variable from outside the class. It provides controlled write access to the variable, often including validation logic to ensure that the new value is valid.

// Practical Example for Encapsulation + Getter/Setters
   // Student class with proper encapsulation, getters, and setters
   class Student {
    private String name; // Private variable
    private int age;     // Private variable
    private double marks;  // Private variable

    // Getter and setter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) { // Ensure name is not null or empty
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    // Getter and setter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 120) { // Ensure age is positive and reasonable
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter and setter for marks
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) { // Ensure marks are within valid range
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }
  } 

public class Day21 {

  public static void main(String[] args) {
    /* 
    BankAccount account = new BankAccount();
    account.deposit(1000);
    account.withdraw(500);
    System.out.println("Current Balance: " + account.getBalance());
    */

    //practical Example for Encapsulation + Getter/Setters
    Student student = new Student();
    student.setName("Alice");
    student.setAge(20);
    student.setMarks(85.5);

    System.out.println(student.getName() + " | " + student.getAge() +" | " + student.getMarks());  // Alice | 20 | 85.5


    // Invalid value text karna
    student.setName(""); // Invalid name
    student.setAge(-5); // Invalid age
    student.setMarks(150); // Invalid marks
  }

}
