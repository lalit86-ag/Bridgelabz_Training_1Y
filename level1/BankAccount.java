package com.gla.level1;
import java.util.Scanner;
public class BankAccount {
    String accountholder;
    int accountNumber;
    int balance;
    public BankAccount(String h,int n,int b){
        this.accountholder=h;
        this.accountNumber=n;
        this.balance=b;
    }
    public void depositMoney(int m){
        balance+=m;
    }
    public void withdrawMoney(int m){
        balance-=m;
    }
    public void accountDetails(){
        System.out.println("The Name of the Account holder is : "+accountholder);
        System.out.println("The Account Number is : "+accountNumber);
        System.out.println("The Current Balance is : "+balance);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        BankAccount a1 = new BankAccount("Punarv",1234,2000);
        BankAccount a2 = new BankAccount("Rajeev",1235,3000);
        System.out.println("Do you want to Withdraw money or Deposit money");
        System.out.println("(Type 1 for Withdrawing money , Type 2 for Depositing money)");
        int request=s.nextInt();
        System.out.println("Enter the amount of money you want to withdraw/deposit");
        int money=s.nextInt();
        if(request==1){
            a1.withdrawMoney(money);
            a2.withdrawMoney(money);
            System.out.println("-----for Acoount 1 :");
            a1.accountDetails();
            System.out.println("-----for Acoount 2 :");
            a2.accountDetails();
        }
        else if(request==2){
            a1.depositMoney(money);
            a2.depositMoney(money);
            System.out.println("-----for Acoount 1 :");
            a1.accountDetails();
            System.out.println("-----for Acoount 2 :");
            a2.accountDetails();
        }
    }
}
