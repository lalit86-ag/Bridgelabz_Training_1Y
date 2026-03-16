package com.gla.level1;
public class MobilePhone {
    String brand;
    String model;
    double price;
    public MobilePhone(String b,String m,double p){
        this.brand=b;
        this.model=m;
        this.price=p;
    }
    public void mobilePhoneDetails(){
        System.out.println("The Brand of the Mobile Phone is : "+brand);
        System.out.println("The Model of the Mobile Phone is : "+model);
        System.out.println("The Price of the Mobile Phone is : "+price);
    }
    public static void main(String[] args){
        MobilePhone M1 = new MobilePhone("Apple","15 Pro Max",150000);
        MobilePhone M2 = new MobilePhone("Samsung","S22 Ultra",175000);
        System.out.println("-----Mobile Phone 1-----");
        M1.mobilePhoneDetails();
        System.out.println("-----Mobile Phone 2-----");
        M2.mobilePhoneDetails();
    }
}
