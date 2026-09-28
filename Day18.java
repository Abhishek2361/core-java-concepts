  
   // Strings -- > Strimg is a Sequence of characters and it's non primative data type , meains string is a class 

   // Why , String is a class not primitive ?
      
   
   
public class Day18 {
  
public static void main(String[] args) {
  String name = "Bablu";

  // Use diffrent method on String
    
  /*
  System.out.println(name.length());
  System.out.println(name.toUpperCase());
  System.out.println(name.charAt(0));
  */

  // 1. String Literal (most common way)
   //  String s2 = "Hello";  // store in the String pool(A special area in heap memory ) 

  // 2. Using this keyword:
    // String s3 = new String("Hello"); // Store out of the String pool and create a new object on Heap Memory if the word Hello is alaready exit or not

  
    // Use == and equal() --> in String compreasion always use equal() method not == operators.

    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); // True - both are poin same pool object 

    String s3 = new String("Hello");
    System.out.println(s1.equals(s3)); // False - s3 create new objet out of the pool 


    // Mutable and immutable string

    // In java Strings are Immutable 
     





}
}
