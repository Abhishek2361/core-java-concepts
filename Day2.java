// Operators in Java

import java.util.Scanner;

public class Day2 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    // Arithmetic Operators

    /*System.out.println("Addition: " + (num1 +num2));
    System.out.println("Subtraction: " + (num1 -num2));
    System.out.println("Multiplication: " + (num1 *num2));
    System.out.println("Division: " + (num1 /num2));
    System.out.println("Modulus: " + (num1 %num2));*/

    // unary Operators

   /* System.out.println("preIncrement: " + (++num1));
    System.out.println("postIncrement: " + (num1++));
    System.out.println("preDecrement: " + (--num2));
    System.out.println("postDecrement: " + (num2--));
    System.out.println("logical NOT: " + (!true));
    System.out.println("bitwise complement: " + (~num1));
    */

    // Relational Operators

    /*System.out.println("Equal: " + (num1 == num2));
    System.out.println("Not Equal: " + (num1 != num2));
    System.out.println("Greater than: " + (num1 > num2));
    System.out.println("Less than: " + (num1 < num2));
    System.out.println("Greater than or equal to: " + (num1 >= num2));
    System.out.println("Less than or equal to: " + (num1 <= num2));
    */

    // Logical Operators

    /*System.out.println("Logical AND: " + ((num1 > 0) && (num2 > 0)));  // true if both conditions are true
    System.out.println("Logical OR: " + ((num1 > 0) || (num2 > 0)));   // true if any one condition is true
    System.out.println("Logical NOT: " + (!(num1 > 0)));   // true if the condition is false
    */

    // Bitwise Operators
    /*System.out.println("Bitwise AND: " + (num1 & num2));
    System.out.println("Bitwise OR: " + (num1 | num2));
    System.out.println("Bitwise XOR: " + (num1 ^ num2));
    System.out.println("Bitwise Left Shift: " + (num1 << 1));
    System.out.println("Bitwise Right Shift: " + (num1 >> 1));
    System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 1));
    System.out.println("Bitwise Complement: " + (~num1));
    */

    // Practice Problem: Swap two numbers without using a third variable

    /*num1 = num1 + num2;
    num2 = num1 -num2;
    num1 =num1 -num2;
    System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
*/

  // practice Problem: Check if a number is even or odd using operator

  /*if (num1 % 2== 0) {
    System.out.println(num1 + " is even");
  } else {
    System.out.println(num1 + " is odd");

  }
    */

  // practice Problem : check whether a number is positive, negative or zero using operator

  /*if (num1 > 0) {
    System.out.println(num1 + " is positive");
  } else if (num1 < 0) {
    System.out.println(num1 + " is negative");
  } else {
    System.out.println(num1 + " is zero");
  }
*/

// practice Problem: Find maximun of two numbers using terranary operator

  /*int max = (num1 > num2) ? num1 : num2;
  System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + max);
  */

  
}
}