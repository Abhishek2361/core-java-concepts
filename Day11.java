 
 // Day 12 -- Methods

// part 1 -- method - Method kya hai , Need of the Methods

// Defination -- Method is a block of code , meanally use for code reuse ability

// Code Reuseability , Modularity , Readability , Maintainability

// Rule - Use Easy Method Name like CalculateSum(),PrintReport();




  public class Day11 {
  
    // Part 2 -- Method - parameters, return type , void , method calling.

       // Return Type
       // Return Type int - Kuch return Karaga
      /*  int add(int a, int b) // a and d is Parameters
       {
        return a+b;
       }  
   
       // Return Type void - kuch return nahi karaga
        void greet(){
          System.out.println("Hello");
        }
          */
   


    public static void main(String[] args) {
       
      // Part - 2
     /*  Day11 obj1 = new Day11();
      int sum =obj1.add(2, 3);
      System.out.println("Sum : "+sum);

      obj1.greet();
      */

      Calculator obj1 = new Calculator();
       int Sum = obj1.add(3, 5);
       int Diffrence =  obj1.subtract(3, 5);
       double divide = obj1.divide(5, 0);

         System.out.println("Sum : "+Sum);
         System.out.println("Diffrence : "+ Diffrence);
         System.out.println("Divide : "+ divide);
    }
  }


   // Part 3 : Method - Practical Programs + method use

       // Practical Problem 1 - Calculator with miltiple Methods:

        class Calculator{

        static int add(int a , int b){
        
          return  a + b;
        }

        static  int subtract(int a, int b){
          return a - b;
        }

        static double divide(int a , int b){

          if(b==0){
            System.out.println("Cannot Divided by Zero ");
            return  0;
          }
           return (double) a/b;
        }
       }
