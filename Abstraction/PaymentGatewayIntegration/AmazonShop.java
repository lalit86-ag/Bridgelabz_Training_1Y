package PaymentGatewayIntegration;

public class AmazonShop implements PaymentProcessor{
    public void payment(double amt) {
        System.out.println("Payment of $ " + amt + " has been done");
    }
    public void refund(double amt){
        System.out.println("Refunding amt : "+amt);
    }
}