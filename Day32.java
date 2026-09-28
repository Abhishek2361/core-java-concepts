   
   // Enum : enum ek special class hai jo fixed, predefined constants ka set define karti hai — jaise ek list jo kabhi runtime pe change nahi ho sakti, sirf usmein se hi choose kar sakte ho.

   enum Day{
      
      MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

   }

public class Day32 {
  public static void main(String[] args) {
   
     Day toDay = Day.MONDAY;
     System.out.println(toDay);

     // Enum with if-else
      if (toDay == Day.SATURDAY || toDay == Day.SUNDAY) {
         System.out.println("It's weekend!");
      } else {
         System.out.println("It's a weekday");
      }


   // Enum with Switch Case
   switch (toDay) {
      case MONDAY:
         System.out.println("Start of the week ");
         break;
      case WEDNESDAY:
         System.out.println("Midweek!");
         break;
      case FRIDAY:
         System.out.println("Almost weekend");
         break;
      case SATURDAY:
      case SUNDAY:
         System.out.println("Weekend!");     
         break;       
   
      default:
         System.out.println("Regular Day");
         break;
   }
  }
}
