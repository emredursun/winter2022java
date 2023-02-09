package day10forloopwhileloop;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        // 1.Example: Type 3 times Hello1 for 1, 3 times Hello2 for 2, 3 times Hello3 for 3, 3 times Hello4 for 4 on the console

        for (int i=1; i<5; i++){
            for (int k=1; k<4; k++){
                System.out.println("Hello" + i);
            }
        }


        // 1.Example
        /*
        Type code to get the output like
        Week: 1
        Day: 1
        Day: 2
        Day: 3
	  .....
        Week: 2
        Day: 1
        Day: 2
        Day: 3
	  ....
        Week: 3
        Day: 1
        Day: 2
        Day: 3
        */

        for (int i=1; i<4; i++){
            System.out.println("Week: " + i);
            for (int k=1; k<4; k++){
                System.out.println("Day: " + k);
            }
            System.out.println("....");
        }

        /*
        // 3.Example:
        Write a Java Program to Print Rectangle Star Pattern using For Loop
        ****
        ****
        ****
        //
        */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of rows...");
//        int userRows = scan.nextInt();
//        System.out.println("Enter the number of columns...");
//        int userColumns = scan.nextInt();
//
//        for (int i=1; i<userRows+1; i++){
//            for (int k=1; k<userColumns+1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        /*
            6.Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
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
