
   // Interface : Interface ek 100% abstract contract hai — ye batata hai "kya kaam hona chahiye", implementing class decide karti hai "kaise hoga"; Java mein multiple inheritance yahi se possible hoti hai.

   interface USB {
    void connect();           // by default public abstract
}

class Pendrive implements USB {
    public void connect() { System.out.println("Pendrive connected, data transfer ready"); }
}

class Mouse implements USB {
    public void connect() { System.out.println("Mouse connected, cursor active"); }
}
     
  

// Practical — real-world use case (Payment gateway system):

interface PaymentGateway {
    boolean processPayment(double amount);
}

class RazorpayGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing " + amount + " via Razorpay");
        return true;
    }
}

class StripeGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing " + amount + " via Stripe");
        return true;
    }
}

class Order {
    PaymentGateway gateway;   // interface type — kisi bhi implementation ko accept karega

    Order(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    void checkout(double amount) {
        gateway.processPayment(amount);
    }
}


  

public class Day31 {

   public static void main(String[] args) {

      USB device = new Pendrive();
      device.connect();     // Pendrive connected, data transfer ready
      device = new Mouse();
      device.connect();     // Mouse connected, cursor active
      
        // Practical — real-world use case (Payment gateway system):

        Order order1 = new Order(new RazorpayGateway());
        order1.checkout(500);   // Processing 500.0 via Razorpay

        Order order2 = new Order(new StripeGateway());
        order2.checkout(1000);   // Processing 1000.0 via Stripe
      
   }
  
}
