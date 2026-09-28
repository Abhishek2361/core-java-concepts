
// Control Statements in Java

public class Day3 {

   // return statement
            int sum(int a, int b){
              return a + b;
            } 

  public static void main(String[] arg){

    int num1 = 10;
    int num2 = 20;

    // if statement
    /*if(num1 > num2){
      System.out.println("num1 is greater than num2");
    }*/

    // if-else statement
    /*if(num1 < num2){
      System.out.println("num1 is less than num2");
    } else {
      System.out.println("num1 is greater than or equal to num2");
    }
*/

    // if-else-if statement
    /*if(num1 == num2){
      System.out.println("num1 is equal to num2");
    } else if(num1 > num2){
      System.out.println("num1 is greater than num2");
    } else {
      System.out.println("num1 is less than num2");
    }*/

    // nested if statement
   /*  if(num1 > 0){
      if(num2 > 0){
        System.out.println("Both num1 and num2 are positive");
      } else {
        System.out.println("num1 is positive but num2 is not");
      }
    } else {
      System.out.println("num1 is not positive");
    }*/



      // Looping Statements in Java

      // For loop

      /*for(int i = 0; i < 5; i++){
        System.out.println("i = " + i);
      }*/

      // While loop
      /*int i =0;
      while(i<5){
        System.out.println("i = " + i);
        i++;
      } */

        // do-while loop
        /*int i =1;
        do{
          System.out.println("i = " +i);
          i++;
        } while(i<5);
        */


        // Jump Statements in Java

        // break statement
        /*for(int i =1; i<=5; i++){
          if(i == 3){
            break;
          }
          System.out.println("i = " + i);
        }*/

          // continue statement
          /*for(int i =1; i<=5; i++){
            if(i == 3){
              continue;
            }
            System.out.println("i = " + i);
          }*/

           // return statement
          /* Day3 s1 = new Day3();
           System.out.println(s1.sum(10, 20));*/

           // switch statement
           /*int day = 3;
           switch(day){
             case 1:
               System.out.println("Monday");
               break;
             case 2:
               System.out.println("Tuesday");
               break;
             case 3:
               System.out.println("Wednesday");
               break;
             case 4:
               System.out.println("Thursday");
               break;
             case 5:
               System.out.println("Friday");
               break;
             case 6:
               System.out.println("Saturday");
               break;
             case 7:
               System.out.println("Sunday");
               break;
             default:
               System.out.println("Invalid day");
           }
          */

           // Ternary operator (it is a shortcut for if-else statement)
           /*int a = 10;
           int b = 20;

           int max =(a > b) ? a : b;
           System.out.println("Max value is: " + max);*/

           // parctice Programs : print all even numbers from 1 to 20
           /*for(int i = 1; i<=20; i++){
            if(i % 2 == 0){
              System.out.println(i);
            }
           }*/

            // pactice problem : calcluate the sum of the digits of a number using while loop
            /*int num = 12345;
            int sum = 0;

            while(num > 0){
              sum += num % 10;
              num /= 10;
            }
            System.out.println("Sum of digits is: " + sum);
            */

            // practice problem : check twhether the number is prime or not 
            /*int num = 29 , i , count = 0;
            for(i = 1; i <= num; i++){
              if(num % i == 0){
                count++;
              }
            }
            if(count == 2){
              System.out.println("The number is prime");
            } else {
              System.out.println("The number is not prime");
            }*/
  }

}
