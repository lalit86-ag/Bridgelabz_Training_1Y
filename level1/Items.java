package com.gla.level1;
public class Items {
    int itemCode;
    String itemName;
    double price;
    int quantity;
    public Items(int ic,String in,double p,int q){
        this.itemCode=ic;
        this.itemName=in;
        this.price=p;
        this.quantity=q;
    }
    public void itemDetails(){
        double cost=price*quantity;
        System.out.println("The Code of the Item is : "+itemCode);
        System.out.println("THe Name of the Item Is : "+itemName);
        System.out.println("The Cost Of the Item is : "+cost);
    }
    public static void main(String[] args){
        Items I1 = new Items(1001,"Pencil",10,5);
        Items I2 = new Items(1002,"Pen",20,5);
        System.out.println("For Item 1 : ");
        I1.itemDetails();
        System.out.println("For Item 2 : ");
        I2.itemDetails();
    }
}
