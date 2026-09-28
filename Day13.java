
// Day 13 -- Method OverLoading + Memeory

   // Part 1 -- Method Overloadiing 
     // Deffination -- Create same Name multiple Metode in a single class . It's Example of Compile-time Polymorphism
       
        /*  class Add{
          int sum(int a, int b){
            return a+b;
          }

          int sum(int a, int b, int c){
            return a+b+c;
          }

          double sum(double a, double b){
            return a+b;
          }
        }
        */ 
     

    // Part 2 - Rule 
       // Valid 
         /* 1. Number of Parameter change
            2. Type of Parametre Change 
            3. Order of Parameter change */

       // Invalid -
          /* Sirf return type change karna overloading Nahi hai .
              int show(int a) --> double show(int a)    // this is wrong
          */ 
    
    // Part 3 - Stack and Heap  - Memory Basic
    
         // Stack --> Method call, Local Variables , refrence (jo method ka ander banta hai)
         // Heap --> Object or unka actual data (jo keyword sa banta hai)      
            
     
          

               
       

public class Day13 {
  
  public static void main(String[] args) {
    
    // Part 1
   /* 
    Add obj1 = new Add();
    System.out.println(obj1.sum(2, 4));
    System.out.println(obj1.sum(4,5,6));
    System.out.println(obj1.sum(4.5, 7.8));
    */
  }
}
