package practice02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
            Type a program:
            For numbers which are a multiple of 3, print "Rock"
            instead of number,
            and for numbers which are a multiple of 5, print "Star"
            instead of the number.
            For numbers which are a multiple by of both 3 and 5,
            print "RockStar" instead of the number.
            Use for loop.
               EXAMPLE:
               int num = 15;
               OUTPUT :  1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock 13 14 RockStar
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number...");
        int userNum = scan.nextInt();

        for(int i=1; i<=userNum; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("RockStar ");
            } else if(i % 3 == 0){
                System.out.print("Rock ");
            } else if(i % 5 == 0){
                System.out.print("Star ");
            } else {
                System.out.print(i + " ");
            }
        }


    }
}
