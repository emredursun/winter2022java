package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fullname: ");

        String userFullName = scan.nextLine(); // To get String data from user use nextLine() method

        System.out.println("The user's fullname: " + userFullName);

    }

}
