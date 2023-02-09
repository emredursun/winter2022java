package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        // Type code to calculate the absolute value of a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check the absolute value of it...");
        double userNum = scan.nextDouble();
        double absValue = userNum > 0 ? userNum : -1 * userNum;
        System.out.println(absValue);

    }
}
