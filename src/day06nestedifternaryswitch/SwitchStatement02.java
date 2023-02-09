package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement02 {
    public static void main(String[] args) {
        /*
             If user enters 9 the code will print October, November, December
             If user enters 5 the code will print May, June, July, ...November, December
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month number... (Valid Numbers: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)");
        int monthNum = scan.nextInt();

        switch (monthNum){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("Agust");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You entered an invalid number!");
                break;
        }

    }
}
