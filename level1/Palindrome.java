package com.gla.level1;
public class Palindrome {
    String text;
    public Palindrome(String t) {
        this.text = t;
    }
    public void checkPalindrome(){
        char[] c=text.toCharArray();
        String s1="";
        String s2="";
        for(int i=0;i<c.length;i++){
            s1+=c[i];
        }
        for(int i=c.length-1;i>=0;i--){
            s2+=c[i];
        }
        if(s1.equals(s2)){
            System.out.println("The Text is Palindrome");
        }
        else{
            System.out.println("The Text is not Palindrome");
        }
    }
    public static void main(String[] args){
        Palindrome t1 = new Palindrome("racecar");
        Palindrome t2 = new Palindrome("Racecar");
        System.out.println("Result of Text 1 :");
        t1.checkPalindrome();
        System.out.println("Result of Text 2 :");
        t2.checkPalindrome();
    }
}
