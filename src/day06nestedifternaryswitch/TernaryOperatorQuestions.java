package day06nestedifternaryswitch;

import java.util.Scanner;

public class TernaryOperatorQuestions {
    public static void main(String[] args) {

        /*
            1) Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
            the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer...");
        int userInput = scan.nextInt();

        String result = userInput % 2 == 0 ? "The integer is even!" : "The integer is odd";
        System.out.println(result);
    }
}
