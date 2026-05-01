package DigitalPaymentInterface;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("The Payment Method is : Credit Card");
    }
}