// Array indexing + multidimensional array

// Indexing  is the unique position of each element  that starts from 0, so last index = length-1

public class Day15 {
  
    public static void main(String[] args) {
        
        int marks[] = {89,67,98,78,98};
  
        // Simple Asseces
       /*
       System.out.println("index 0 : "+marks[0]);
       System.out.println("index 1 : "+marks[1]);
       System.out.println("index 2 : "+marks[2]);
       System.out.println("index 3 : "+marks[3]);
       System.out.println("index 4 : "+marks[4]);
       */
        // Looping Access
       /* 
        for (int i = 0; i < marks.length; i++) {
        
        System.out.println(marks[i]);
        
       } 
       */



       // 2D Array -- 2D array is an array of arrays, it is used to store data in tabular form (rows and columns)

       // Declaration 
       /* 
          int[][] matrix; // declaration 
          matrix = new int[3][4]; // 3 rows, 4 columns - creation
          matrix[2][3]=4;
          System.out.println(matrix[2][3]);
       */

       // Practical  -- 2D array create,access,modify
         // Array create 
          int[][] matrix = { {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

            // Single Element Access
            //System.out.println(matrix[1][2]); //  6 (row 1, column 2)

            // print complet 2d array using nested loop
            /* 
             for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();   // next row pe jaane ke liye newline
        }
            */

        // Modify an element
       /*  matrix[0][0] = 100;
        System.out.println(matrix[0][0]);
       */
            
           int sum = 0;
           for (int row = 0; row < matrix.length; row++) {
              for (int col = 0; col < matrix[row].length; col++) {
               sum += matrix[row][col];
          }
        }
        System.out.println("Total sum: " + sum);   // 45


    }
}
