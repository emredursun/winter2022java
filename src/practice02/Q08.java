package practice02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
        Get the number of rows from user then draw a right triangle by using asterixs
        Number of rows = 4 ==>    *
                                  * *
                                  * * *
                                  * * * *
        */

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the side length of the equilateral triangle...");
        int lengthOfASide = scan1.nextInt();

        for (int i=1; i<lengthOfASide+1; i++) {
            for (int k = 1; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
