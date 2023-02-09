package practice01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Ask user to enter a number. If the number is less than 10 and greater
        than or equal to 0, calculate its cube. Otherwise, calculate its square.
        Cube of a = a*a*a Square of a = a*a
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number...");
        int userNum = scan.nextInt();

        String result = (userNum >= 0 && userNum < 10) ? ("The cube is " + userNum * userNum * userNum) : ("The square " + userNum * userNum);
        System.out.println(result);

    }
}
