
   // Static -- > Static is a keyword  
   
   // Static Varible
       // Practical  - 
          // Without Static ka Problem
             /*class Student{
              String name;
              String CollegeName;  // har object mein Akag sa Store Hoga - Wasteful

             }
             */

          // With Static ka Problem
             /*class Student{
              String name;
              static String CollegeName = "SVSU";  // Static variable - Sab object ka liya same copy 
             }
              */

       // Practical Case - counter(Kitna object bane ,track Karana)
       /* 
       class Student{
          static  int count = 0; // Static Counter

          Student(){
            count++; // Har new object bana par increment
          }
       }      
      */

       // Static Block - Static Block is a block of code which is executed only once when the class is loaded into memory. It is used to initialize static variables or perform any setup operations that need to be done before the class is used.
    

     // Static Method - Static methods are methods that belong to the class rather than an instance of the class. They can be called without creating an object of the class and can only access static variables and other static methods.

            class MathUtils {
              static int square(int n) {
               return n * n;
             }

             static int cube(int n) {
              return n * n * n;
             }
            }

   public class Day20 {

      // Static Block - practical case

     /*
     static int value;
     static{
        value = 100;
        System.out.println("Static Block is executed");
     }
        */
  public static void main(String[] args) {
    
    // Without Static ka Problem
    /* 
    Student s1 = new Student();
     s1.name = "Abhishek";
     S1.Collegname = "SVSU"
    Student s2 = new Student();
     s2.name = "Rahul";
     S.Collegname = "SVSU"; // Smae value Dubara Declear
    */

    
    // With Static 
    /* 
    Student s1 = new Student();
     s1.name = "Abhishek";
    
    Student s2 = new Student();
    s2.name = "Rahul";
    System.out.println(s1.CollegeName); //SVSU 
    System.out.println(s2.CollegeName); //SVSU (Same copy)

    // Best Practice - Class name sa access katrto , object sa nahi
    System.out.println(Student.CollegeName);
   */
    
    // Practical Case - counter(Kitna object bane ,track Karana)
     /* 
       Student s1 = new Student();
       Student s2 = new Student();
       Student s3 = new Student();

       System.out.println(Student.count);
    */
    
       // Static Block - practical case
   /* 
     System.out.println("Main Method Run After Static Block...");
     System.out.println("Value of Static Variable: " + value);
     */
  
    
    // Static Method - practical case
    
    System.out.println("Square of 5: " + MathUtils.square(5));
    System.out.println("Cube of 3: " + MathUtils.cube(3));
     
     
   
  }

}
