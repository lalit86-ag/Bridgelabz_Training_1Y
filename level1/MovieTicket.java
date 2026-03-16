package com.gla.level1;
public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    public MovieTicket(String m,int s,double p){
        this.movieName=m;
        this.seatNumber=s;
        this.price=p;
    }
    public void displayDetails(){
        System.out.println("The Name of the move is : "+movieName);
        System.out.println("The Seat Number is : "+seatNumber);
        System.out.println("The Price of the ticket is : "+price);
    }
    public static void main(String[] args){
        MovieTicket m1 = new MovieTicket("Constantine",35,1000);
        MovieTicket m2 = new MovieTicket("Sherlock Holmes",40,800);
        System.out.println("-----Movie 1 :-----");
        m1.displayDetails();
        System.out.println("-----Movie 1 :-----");
        m2.displayDetails();
    }
}
