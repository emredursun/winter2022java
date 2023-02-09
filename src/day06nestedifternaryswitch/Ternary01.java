package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        // Ternary is the short way of the nested-If Statement

        //If an integer is positive print “The integer is positive” otherwise print “The integer is not positive”

        // 1:way: Solve by using if-else Statement
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer...");

        int userNum = scan.nextInt();
        if(userNum >= 0){
            System.out.println("The integer is positive");
        } else if (userNum < 0){
            System.out.println("The integer is not positive");
        }
        else {
            System.out.println("You did not enter an integer!");
        }

        // 2.Way: Ternary
                     // Condition    Question Mark   Result for positive scenario   Colon   Result for negative scenario
        String result = userNum >= 0      ?          "The integer is positive"       :       "The integer is not positive";
        System.out.println(result);
        */

        //Write a program to print the minimum of 2 integers on the console. Use ternary...

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first integer...");
        int userFirstNum = scan.nextInt();
        System.out.println("Enter your second integer...");
        int userSecondNum = scan.nextInt();
        String minNumOfUser = userFirstNum > userSecondNum ? "Your min number is " + userSecondNum : "Your min number is " + userFirstNum;

        System.out.println(minNumOfUser);
    }
}
