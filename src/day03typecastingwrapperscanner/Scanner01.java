package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        // Scanner Class is used to get data from user in Java
        /*
          Scanner scan = new Scanner(System.in);
                # Scanner: return type of object(scan)
                # Scanner(System.in): Class; The class which the object will be created from!
                # System.in: system gets data from user in Java
                # scan: Object name
                # new: Keyword to create object from a class (Scanner(System.in))
                # From a(Scanner(System.in)) class to able to create an object(scan), you need to use "new" keyword which is a command in Java!
         */

        // How will we get data from user?
        // 1.Step:
        Scanner scan = new Scanner(System.in);

        // 2.Step:
        System.out.println("Enter your age: ");

        // 3.Step:
        int userAge = scan.nextInt();

        // 4.Step:
        System.out.println("The user's age is " + userAge);

    }

}
