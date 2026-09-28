
    // Inner classes : Inner class ek class ke andar defined dusri class hoti hai — iska use tab hota hai jab ek class sirf apni "outer" class ke liye hi meaningful ho, akele uska koi matlab na ho.

    class Car{

        private String model = "Swift";

        class Engine{    // Inner class
            void start(){
                System.out.println(model + " ka engine start hua"); //outer ka privete field access
            }
        }
    }
    // Non-static (Member) Inner Class — practical:
    
     

public class Day30 {
    public static void main(String[] args) {
        
        Car c = new Car();
        Car.Engine e = c.new Engine();
        e.start();
    }
  
}
