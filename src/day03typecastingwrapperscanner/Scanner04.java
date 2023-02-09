package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width and the length of a rectangle");

        int width = scan.nextInt();
        int length = scan.nextInt();

        System.out.println("The area of the rectangle is " + width * length);
        System.out.println("The perimeter of the rectangle is " + 2 * (width + length));


    }

}
