package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {

        // Get the number of days from user and print the name of the day
        // For example; 1 ==> Sunday, 2 ==> Monday

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number... (Examples: 1, 2, 3, 4, 5, 6, 7)");
        int dayNum = scan.nextInt();

        // 1.Way: Solve by using if-else statement

        if(dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("You entered invalid number!");
        }

        // 2.Way: Solve by using Switch Statement
        // When to use switch? If you have more than three options switch is preferable!

        switch (dayNum){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("You entered invalid number!");
                break;
        }

    }
}
