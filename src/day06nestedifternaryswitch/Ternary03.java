package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {

        /*
            You have 2 Integers.
            If both of the integers are pisitive, do mutiplication
            If one is negative and the other one is positive, return "I do not know how to multiply"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer...");
        int firstNum = scan.nextInt();
        System.out.println("Enter your second integer...");
        int secondNum = scan.nextInt();

        // If your ternary returns different data types for differents scenarios, do not create reserved area for the result, put it directly System.out.println()!
        System.out.println((firstNum > 0 && secondNum > 0) ? firstNum * secondNum : "I do not know how to multiply!");


    }
}
