package DigitalPaymentInterface;

public class Wallet implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("The Payment Method is : Wallet");
    }
}