package practice01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
         Type java code by using ternary and if-else. Ask user to enter two integers
         Write a program to print the maximum  one on the console.(Do not forget they may be equal)
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer...");
        int firstInt = scan.nextInt();
        System.out.println("Enter your second integer...");
        int secondInt = scan.nextInt();

        String maxInt = (firstInt == secondInt) ? ("Teay are equals integers!") : (firstInt > secondInt ? "Your maximum number is " + firstInt : "Your maximum number is " + secondInt);
        System.out.println(maxInt);
    }
}
