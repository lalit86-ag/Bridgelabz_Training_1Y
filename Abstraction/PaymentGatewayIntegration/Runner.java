package PaymentGatewayIntegration;

public class Runner {
    public static void main(String[] args){
        PaymentProcessor p=new AmazonShop();
        p.payment(6000);
        p.refund(5000);
    }
}