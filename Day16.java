
    // Jagged Array --> Array of arrays where each sub-array can have a different length

public class Day16 {
  
    public static void main(String[] args) {
        
        // Jagged Array Declaration and Creation
        /*int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 columns
        jaggedArray[1] = new int[3]; // Second row has 3 columns
        jaggedArray[2] = new int[1]; // Third row has 1 column

        // Assigning values to the jagged array
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[2][0] = 6;
        

        // Printing the jagged array using nested loops
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
         */


        // 3D Array --> An array of 2D arrays, used to store data in three dimensions (like a cube)
        // Declaration and Creation of a 3D array
        int[][][] threeDArray = new int[2][3][4]; // 2 layers, each with 3 rows and 4 columns

        // Assigning values to the 3D array
        threeDArray[0][0][0] = 1;
        threeDArray[0][0][1] = 2;
        threeDArray[0][1][0] = 3;
        threeDArray[0][1][1] = 4;
        threeDArray[1][0][0] = 5;
        threeDArray[1][0][1] = 6;

        // Printing the 3D array using nested loops
        for (int k = 0; k < threeDArray.length; k++) {
            System.out.println("Layer " + k);
            for (int i = 0; i < threeDArray[k].length; i++) {
                for (int j = 0; j < threeDArray[k][i].length; j++) {
                    System.out.print(threeDArray[k][i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
