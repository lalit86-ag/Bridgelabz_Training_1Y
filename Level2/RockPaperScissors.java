package com.gla.Level2;
import java.util.Scanner;
public class RockPaperScissors {
        static int compChoice() {    // method for computer choice
            return (int)(Math.random() * 3) + 1;
        }
        static String winner(int user, int comp) {    // method to decide winner
            if (user == comp)
                return "Draw";
            if ((user == 1 && comp == 3) ||
                    (user == 2 && comp == 1) ||
                    (user == 3 && comp == 2))
                return "User";
            return "Computer";
        }
        static String name(int n) {    // method to convert number to word
            if (n == 1) return "Rock";
            if (n == 2) return "Paper";
            return "Scissors";
        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of games:");
            int n = sc.nextInt();
            int userWin = 0, compWin = 0;
            for (int i = 1; i <= n; i++) {
                System.out.println("\nGame " + i);
                System.out.println("1.Rock  2.Paper  3.Scissors");

                int user = sc.nextInt();
                int comp = compChoice();
                System.out.println("User = " + name(user));
                System.out.println("Computer = " + name(comp));

                String res = winner(user, comp);
                System.out.println("Result = " + res);
                if (res.equals("User"))
                    userWin++;
                else if (res.equals("Computer"))
                    compWin++;
            }
            System.out.println("\nTotal User Wins = " + userWin);
            System.out.println("Total Computer Wins = " + compWin);
            double up = (userWin * 100.0) / n;
            double cp = (compWin * 100.0) / n;
            System.out.println("User Winning % = " + up);
            System.out.println("Computer Winning % = " + cp);
        }
}

