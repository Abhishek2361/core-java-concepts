    
    //  Lambda : Lambda expression ek naam-less, chhoti function likhne ka shortcut hai — jab kisi interface mein sirf ek hi abstract method ho (functional interface), tab poori class banane ki jagah seedha ek line mein logic likh sakte ho.

       /*@FunctionalInterface
        interface Calculator {
          int operate(int a, int b);   // sirf ek method
         }
          */

import java.util.*;

class Employee {
    String name;
    int salary;
    Employee(String name, int salary) { this.name = name; this.salary = salary; }
    public String toString() { return name + " - " + salary; }
}


public class Day34 {
   public static void main(String[] args) {
  
    /* 
    Calculator add = (a , b) -> a + b;
    Calculator multiply = (a , b) -> a * b;

    System.out.println(add.operate(3, 4));
    System.out.println(multiply.operate(3, 4));
    */


    List<Employee> employees = new ArrayList<>();
employees.add(new Employee("Amit", 40000));
employees.add(new Employee("Priya", 60000));
employees.add(new Employee("Rahul", 25000));

// Traditional tarika hota to Comparator ki poori class banani padti
// Lambda se ek line mein:
employees.sort((e1, e2) -> e2.salary - e1.salary);   // descending order

System.out.println(employees);
// [Priya - 60000, Amit - 40000, Rahul - 25000]



   }
  
}
