
// Inheritance in Java

 class sum{
  sum(){
System.out.println("in sum");
  }
  sum(int n1){
    System.out.println(n1);
  }
}

class AddSum extends sum{

 this.AddSum(){
System.out.println("in AddSum");
  }
  AddSum(int n1){
    System.out.println(n1);
  }

}

public class Day7 {

public static void main(String args[]){

   //inheritance 

  /*Advcal obj1 = new Advcal();
  System.out.println(obj1.add(3, 5));
  System.out.println(obj1.mul(3,5));
  System.out.println(obj1.div(4, 5));
  System.out.println(obj1.sub(3, 4));
    */

   // this keyword
   AddSum obj = new AddSum(3);


  }

}
