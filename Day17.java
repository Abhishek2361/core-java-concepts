
  // array of Object + Enhanced for loop

     // Array of Objects --> java mein hum ek array bana sakte hain jisme elements primitives nahi, balki objects hon — jaise Student[], Employee[]

     // Array of Object - Practical Example: Suppose we have a class Student with attributes like name, age and marks. We can create an array of Student objects to store multiple students.

     class Student{
      String name;
      int age;
      double marks;

      void display(){
        System.out.println(name + " | Age: " + age +" | Marks " + marks);
      } 
     }

public class Day17 {
  public static void main(String[] args) {
    /*Student[] students = new Student[3]; // 3 slots, sab null abhi

      // Har slot a liya alag object banana jaruri hai
      students[0] = new Student();
        students[0].name = "Buddy";
        students[0].age = 21;
        students[0].marks = 88.5;

        students[1] = new Student();
        students[1].name = "Rahul";
        students[1].age = 22;
        students[1].marks = 75.0;

        students[2] = new Student();
        students[2].name = "Priya";
        students[2].age = 20;
        students[2].marks = 92.3;


      // Loop sa sara Student Display Karanga 
      for (int i = 0; i < students.length; i++) {
        students[i].display();
      }

        
      // find the Topper Student
        Student topper = students[0];
      for (int i = 1; i < students.length; i++) {
         if (students[i].marks > topper.marks) {
        topper = students[i];
       }
      }
       System.out.println("Topper: " + topper.name);   // Priya
      */


       // Enhanced For Loop -- for-each loop

       int[] marks = {85, 90, 78, 92, 88};

            // Traditional — index control ke saath
          for (int i = 0; i < marks.length; i++) {
              System.out.println(marks[i]);
          }
          System.out.println("Traditional End and Enhanced Start..");
       // Enhanced for-each — simpler, direct value
          for (int mark : marks) {
              System.out.println(mark);
          }
  }
  
}
