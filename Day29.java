
   // Casting + Abstraction 
     // Casting : casting is the process of converting a variable from one data type to another. In Java, there are two types of casting:
      // 1. upcasting : converting a subclass object to a superclass reference . upcasting is automaticaly done by java compiler.
        // example of upcasting :
        class Phone { 
          void ring() { 
            System.out.println("Phone is ringing"); 
          }
         }
         class iPhone extends Phone { 
             void faceID() {
               System.out.println("Face ID unlock"); } 
         }
      
      // 2.Downcasting : Parent reference ko wapas child type mein convert karna, manually cast lagana padta hai, aur galat kiya to crash.
       // example of Downcasting ; 

       class Teacher { void takeClass() {
         System.out.println("Taking class");
         }
       }
       class MathTeacher extends Teacher { 
         void setExamPaper() 
         {
           System.out.println("Setting Math paper");
           } 
         }
   
   // Abstract Keyword : abstract keyword ek incomplete blueprint banata hai — abstract class ka object nahi ban sakta, aur abstract method ka sirf naam hota hai, body child class ko khud likhni padti hai.
       
        // Example of Abstract 
        abstract class Vehicle {
          abstract void move();          // sirf declaration, body nahi
    
            void fuelUp() {                // normal method bhi ho sakta hai
             System.out.println("Filling fuel");
            }
       }

       class Car extends Vehicle {
          void move() { System.out.println("Car chalti hai steering se"); 

          }
       }

      class Bike extends Vehicle {
          void move() { System.out.println("Bike chalti hai handle se"); 
          }
      }
   
          

public class Day29 {
  public static void main(String[] args) {
    // upcasting example 

   /* Phone p = new iPhone();   // Upcasting - automatic
    p.ring();                 // ✅ chalega
    p.faceID();                // ❌ Error - Phone reference ko faceID() ka pata hi nahi
    */

    // Downcasting example

    Teacher t = new MathTeacher();        // Upcasting pehle
    MathTeacher mt = (MathTeacher) t;     // Downcasting - explicit cast
    mt.setExamPaper();                     // ✅ chalega, kyunki asli object MathTeacher hi tha

    /*Teacher t2 = new Teacher();
    MathTeacher mt2 = (MathTeacher) t2;   // ❌ ClassCastException - ye Teacher kabhi MathTeacher tha hi nahi
    */

    // Example of Abstract keyWord
       //Vehicle v = new Vehicle();   // ❌ Error - abstract class ka object nahi bana sakte
       Vehicle v1 = new Car();      // ✅ chalega
       v1.move();                   // Car chalti hai steering se
  }
}
