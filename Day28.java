
   // Final Keyword + Object Class 
      // Final Keword : final keyword ka matlab hai "ab yeh change nahi ho sakta" — lekin iska exact effect depend karta hai ki kis cheez pe laga hai (variable, method, ya class)...
      // 1. Final Variable :  value ek baar set hone ke baad change nahi ho sakti
         // Example of final variable
         class FinalVariableExample {

            final int MAX_VALUE = 100; // final variable
  
              void displayMaxValue() {
                System.out.println("Max Value: " + MAX_VALUE);
              }
            
         }
         // 2. Final Method : final method ko override nahi kiya ja sakta
         class FinalMethodExample {
            final void displayMessage() {
                System.out.println("This is a final method.");
            }
         }
         class SubClass extends FinalMethodExample {
            // This will cause a compilation error because displayMessage() is final
            /*void displayMessage() {
                System.out.println("Trying to override the final method.");
          }*/
         }

         // 3. Final Class : final class ko extend nahi kiya ja sakta
         final class FinalClassExample {
            void display() {
                System.out.println("This is a final class.");
            }
         }
         class AnotherClass /*extends FinalClassExample*/ {
            // This will cause a compilation error because FinalClassExample is final
            /*void display() {
                System.out.println("Trying to extend the final class.");
            }*/
         }
    
    
   // Object class : Object class Java ki sabse upar wali (root) class hai — har class, chahe tum banao ya Java ki built-in ho, directly ya indirectly Object se hi extend hoti hai.

   class Student // extends Object // ye line optional hai, kyunki Java automatically har class ko Object se extend kar deta hai
   {
       String name;
       int age;

       Student() {
           this.name = "John Doe";
           this.age = 20;
       }

       void show() {
           System.out.println("Name: " + name);
           System.out.println("Age: " + age);
       }
   }
  
public class Day28 {
  public static void main(String[] args) {
    
    // Example of final variable
    /* 
    FinalVariableExample example = new FinalVariableExample();
    example.MAX_VALUE = 200; // This line will cause a compilation error because MAX_VALUE is final
    example.displayMaxValue();
    */

    // Final Method Example
    FinalMethodExample finalMethodExample = new FinalMethodExample();
    finalMethodExample.displayMessage();

    // Final Class Example
    FinalClassExample finalClassExample = new FinalClassExample();
    finalClassExample.display();

    // Object Class Example
    Student student = new Student();
    student.show();
         // Object class ka 4 main methods hai :
         // 1. toString() : Object ka string representation return karta hai 
         System.out.println(student.toString()); // ye line student object ka string representation print karegi 


         // 2. equals(Object obj) : Object ke equality ko check karta hai
         System.out.println(student.equals(new Student())); // ye line false return karegi kyunki ye do alag objects hai, chahe unki values same ho
         System.out.println(student.equals(student)); // ye line true return karegi kyunki ye same object hai

         // 3. hashCode() : Object ka hash code return karta hai
          System.out.println(student.hashCode()); // ye line student object ka hash code print karegi

        // 4. getClass() : Object ka class type return karta hai
          System.out.println(student.getClass()); // ye line student object ka class type print karegi
          
          
  }
}
