package practice01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
                 /*
              Ask user to enter an integer
              Type java code by using nested if statement,
              If a number is even then check if it is divisible by 3 or not.
              If it is divisible by 3 the output will be "Perfect even number"
              otherwise, the output will be "Good even number."
              If the number is odd then check if it is divisible by 3 or not.
              If it is divisible by 3 the output will be "Perfect odd number"
              otherwise, the output will be "Good odd number."
              */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer...");
        int userInt = scan.nextInt();

        if(userInt % 2 == 0){
            if(userInt % 3 == 0){
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number.");
            }
        } else {
            if(userInt % 3 == 0){
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number.");
            }
        }

    }
}
