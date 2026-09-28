
  // Methods in Java 

 /*class Demo{

  // method Declaration

  public void display(){

    System.out.println("This is a method in Java"); // Printing a message to the console
  }

  public int sum(int a, int b){

    return a + b; // Returning the sum of two integers
  }
}*/


public class Day4 {

    public static void main(String[] arg){


  
    /*Demo obj = new Demo(); // Creating an object of the Demo class

      obj.display(); // Calling the display method

     int result = obj.sum(10, 20); // Calling the sum method and storing the result in a variable
     System.out.println("The sum is: " + result); // Printing the result
     */

     // Array declaration , creation and initialization

     /*int[] arr;  // declaration 
     arr = new int[5]; // Creating an array of size 5
     arr[0] = 10; // Initializing the first element of the array
     arr[1] = 20;
     arr[2] = 30;
     arr[3] = 40;
     arr[4] = 50;

     System.out.println(arr[3]);
     */

     /*
     int arr[] = {10, 20, 30, 40, 50}; // Declaration and initialization of an array
     System.out.println(arr[4]); // Printing the fifth element of the array
     
     System.out.println(arr[2]+arr[3]); // Printing the sum of the third and fourth elements of the array

     // find max element of the array
      int max = arr[0]; // Assuming the first element is the maximum
      for(int i=1; i<arr.length; i++){ // Looping through the array starting from the second element
        if(arr[i] > max){ // If the current element is greater than the current maximum
            max = arr[i]; // Update the maximum
        }
      }
      System.out.println("The maximum element is: " + max); // Printing the maximum element
      */


      // Multidimensional array declaration, creation and initialization

      /*int[][] arr = new int[2][3]; // Creating a 2D array with 2 rows and 3 columns
      */


      /*// print 2D Array

      int [][] arr = {{2,4,6},{4,5,7}}
      for(int i = 0 ; i < arr.length; i++){ // Looping through the rows of the array
        for(int j = 0; j < arr[i].length; j++){ // Looping through the columns of the array
            System.out.print(arr[i][j] + " "); // Printing each element of the array
        }
        System.out.println(); // Moving to the next line after printing a row
      }
        */

      // Traversing and Updating an Array
      /*int[] arr = {10, 20, 30, 40, 50};
      System.out.println("Original Array: ");
      for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " "); // Printing each element of the original array
      }

      // Updating each element of the array
      System.out.println("\nUpdated Array: ");
      for(int i = 0; i<arr.length; i++){
        arr[i] = arr[i] + 5; // Incrementing each element of the array by 5
        System.out.print(arr[i] + " "); // Printing each updated element of the array
      }

      */
      
      // Updating an element at a specific index
      /*int[] arr = {10, 20, 30, 40, 50}; 
      arr[2] = 100; // Updating the third element of the array to 100
      System.out.println("\nArray after updating the third element: ");
      for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " "); // Printing each element of the updated array
      }*/

        // create the right sequence in increasing order of the given array
        
       int[] arr = {5, 2, 8, 1, 3};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in increasing order:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        


 }
}
