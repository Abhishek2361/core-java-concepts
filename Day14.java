   
   // Array Introduction 
     

public class Day14 {
  
   public static void main(String[] args) {
      
      /* 
      // Declaration + creation + initialization 1 hi line ma 
      int[] numbers = {10,20,40,60,39};
       System.out.println(numbers[4]);

      // Declaration + creation (with size) , or fir initialization alag sa 
      int[] arr = new int[5];
      arr[2] = 3;
      System.out.println(arr[4]);

      // Explicit new + values
      int[] numbers3 = new int[]{10,20,40};
      System.out.println(numbers3[2]);
      */

      int marks[] = {89,67,98,78,98};

      // Access
      System.out.println("First Marks : "+ marks[0]);
      System.out.println("Last Marks : "+ marks[marks.length-1]);

      // Sum calculate karna 
      int sum = 0;
      for(int i = 0; i < marks.length; i++)
        sum +=marks[i];
   
   System.out.println("Sum of marks : "+sum);
   }
}
