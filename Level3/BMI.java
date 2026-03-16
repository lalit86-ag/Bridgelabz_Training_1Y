package com.gla.Level3;
import java.util.Scanner;
public class BMI {
    public static String[][] findBMI(double arr[][]) {    // method to calculate BMI and status
        String result[][] = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = arr[i][0];
            double heightCm = arr[i][1];
            double heightM = heightCm / 100;     // convert cm to meter
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void display(String res[][]) {
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double data[][] = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1));
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1));
            data[i][1] = sc.nextDouble();
        }
        String result[][] = findBMI(data);
        display(result);
    }
}
