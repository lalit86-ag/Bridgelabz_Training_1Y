package com.gla.Level1;

public class NullPointerExample {
    public static void generateException() {    // method to generate exception
        String text = null;
        System.out.println(text.length());    // generate nullpointerexception
    }
    public static void handleException() {    // method to handle exception
        try {
            String text = null;
            System.out.println(text.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException handle");
        }
    }
    public static void main(String[] args) {
        try {    //first generate exception
            generateException();
        }
        catch (Exception e) {
            System.out.println("Exception generated");
        }
        handleException();    // handle exception
    }
}

