package PasswordStrengthValidator;
import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your password");
        String password=s.nextLine();
        boolean ans=SecurityUtils.checkPassword(password);
        if(ans==true){
            System.out.println("Your Password is Strong");
        }
        else{
            System.out.println("Your Password is Weak");
        }

    }
}
