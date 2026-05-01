package DigitalPaymentInterface;

public class UPI implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("The Payment Method is : UPI");
    }
}