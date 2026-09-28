  
   // Exception Handling Introduction
           //Exception ek unexpected event/problem hai jo program ke normal execution flow ko disrupt karta hai — jaise divide by zero, array index out of bounds, ya null reference access. Java isko object ke roop mein represent karta hai (Exception class ka instance), jise handle karke program ko crash hone se bachaya ja sakta hai.


public class Day35 {
  
  public static void main(String[] args) {
    
    /* 
        int a = 10;
        int b = 0;
        // Expection Heandling Using Try-Catch
        try {
            System.out.println(a / b);   // yahan exception aayega
        } catch (ArithmeticException e) // Exception object (e) se useful information milti hai:
        {
            System.out.println("Cannot divide by zero!");
            System.out.println("Error Occurred: "+e.getMessage()); 
        }finally 
         {
           //finally block — hamesha execute hota hai (chahe exception aaye ya na aaye):
         System.out.println("This always runs — cleanup code goes here");
        }
        System.out.println("Program continues normally...");   // yeh ab execute hoga!

        */




        // try with Multiple catch
       
        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);        // ArrayIndexOutOfBoundsException
            System.out.println(10 / 0);              // yeh line kabhi nahi pahunchegi (upar hi exception aa gayi)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math problem: " + e.getMessage());
        }
    }
}
  
