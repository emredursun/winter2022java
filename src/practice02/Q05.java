package practice02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*
        Type a program to check if a positive number is perfect or not
        For example if the number is 6, we should see
        Perfect Number
        on the console.
        (The factors of 6 are : 1,2,3,6
        1+2+3=6  ==> it is perfect number )
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number to check it perfect or not");
        int  userNum = scan.nextInt();
        int sumOfFactors = 0;

        for (int i=1; i<userNum; i++){
            if(userNum%i == 0){
                System.out.print(i + " ");
                sumOfFactors = sumOfFactors + i;
            }
        }

        System.out.println();

        if(sumOfFactors == userNum){
            System.out.println(userNum + " is perfect number!");
        } else {
            System.out.println(userNum + " is not perfect number!");
        }

    }

}
