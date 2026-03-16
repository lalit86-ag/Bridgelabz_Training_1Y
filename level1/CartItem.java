package com.gla.level1;
import java.util.Scanner;
public class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String in,double p,int q){
        this.itemName=in;
        this.price=p;
        this.quantity=q;
    }
    public void addItem(int i){
        quantity+=i;
    }
    public void subtractItem(int i){
        quantity-=i;
    }
    public void displayDetails(){
        double cost=quantity*price;
        System.out.println("The Name of the item is : "+itemName);
        System.out.println("Thr quantity of the item is : "+quantity);
        System.out.println("The cost of the item is : "+cost);
    }
    public static  void main(String[] args){
        CartItem i1=new CartItem("Notebook",50,5);
        CartItem i2=new CartItem("Pen",10,10);
        Scanner s=new Scanner(System.in);
        System.out.println("To Add an item type 1");
        System.out.println("To Remove an item type 2");
        int choice=s.nextInt();
        System.out.println("Enter the quantity of item you want to add/remove");
        int quan=s.nextInt();
        if(choice==1){
            i1.addItem(quan);
            i2.addItem(quan);
            System.out.println("-----For Item 1-----");
            i1.displayDetails();
            System.out.println("-----For Item 2-----");
            i2.displayDetails();
        }
        else if(choice==2){
            i1.subtractItem(quan);
            i2.subtractItem(quan);
            System.out.println("-----For Item 1-----");
            i1.displayDetails();
            System.out.println("-----For Item 2-----");
            i2.displayDetails();
        }
    }
}
