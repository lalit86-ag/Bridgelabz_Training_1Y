package PaymentGatewayIntegration;
public interface PaymentProcessor {
    public void payment(double amt);

    default void refund(double amt){
        System.out.println("Refund has been requested");
    }
}