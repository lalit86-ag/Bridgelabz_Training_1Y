package com.gla.Level2;
import java.util.Scanner;
public class Grade {
    static int[][] getMarks(int n) {     // method to generate random marks
            int m[][] = new int[n][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    m[i][j] = (int)(Math.random() * 90) + 10;   // 2 digit marks
                }
            }
            return m;
        }
        static double[][] calcResult(int m[][]) {      // method to calculate total avg percentage
            int n = m.length;
            double r[][] = new double[n][3];   // total avg %
            for (int i = 0; i < n; i++) {
                int total = m[i][0] + m[i][1] + m[i][2];
                double avg = total / 3.0;
                double per = total / 3.0;
                avg = Math.round(avg * 100) / 100.0;
                per = Math.round(per * 100) / 100.0;
                r[i][0] = total;
                r[i][1] = avg;
                r[i][2] = per;
            }
            return r;
        }
        static String grade(double p) {    // method to give grade
            if (p >= 80) return "A";
            else if (p >= 70) return "B";
            else if (p >= 60) return "C";
            else if (p >= 50) return "D";
            else if (p >= 40) return "E";
            else return "R";
        }
        static void display(int m[][], double r[][]) {
            System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i][0] + "\t");
                System.out.print(m[i][1] + "\t");
                System.out.print(m[i][2] + "\t");
                System.out.print(r[i][0] + "\t");
                System.out.print(r[i][1] + "\t");
                System.out.print(r[i][2] + "\t");
                System.out.println(grade(r[i][2]));
            }
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of students:");
            int n = sc.nextInt();
            int marks[][] = getMarks(n);
            double result[][] = calcResult(marks);
            display(marks, result);
        }
    }

