package DigitalPaymentInterface;

public class Runner {
    public void main(String[] args){
        PaymentMethod p1=new UPI();
        PaymentMethod p2=new CreditCard();
        PaymentMethod p3=new Wallet();
        System.out.println("-----Payment Method of Transaction 1-----");
        p1.pay();
        System.out.println("-----Payment Method of Transaction 2-----");
        p2.pay();
        System.out.println("-----Payment Method of Transaction 2-----");
        p3.pay();
    }
}
