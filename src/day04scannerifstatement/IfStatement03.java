package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        // Ask user to enter a day name then
        // print Weekday for Monday, Tuesday, Wednesday, Thursday, Friday
        // print Weekend for Saturday and Sunday

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name...");
        String dayName = scan.next();

        // Following code works but it is not professional because there are many repetition
        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");

        }if(dayName.equals("Saturday")){
            System.out.println("Weekend");
        }

        if (dayName.equals("Sunday")){
            System.out.println("Weekend");
        }
        // Solve the previous task without repetition
        // Note: In java, there is OR Operator sign is "||"
        // If you use "||" when one is true the result will be true
        if(dayName.equals("Monday") || dayName.equals("Tueasday") || dayName.equals("Wednesday") || dayName.equals("Thursday") || dayName.equals("Friday")){
            System.out.println("Weekday");
        }

        if (dayName.equals("Saturday") || dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }

        // If user enters the day names in different cases like monday or mOnDaY
        // Java creates another method to compare 2 Strings, the method wil ignore the cases!
        // According to that method monday, MONDAY, mOnDaY will be same
        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tueasday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");
        }

        if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend Day");
        }

        // Make the if statement parenthesis shorter
        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                            dayName.equalsIgnoreCase("Tueasday") ||
                            dayName.equalsIgnoreCase("Wednesday") ||
                            dayName.equalsIgnoreCase("Thursday") ||
                            dayName.equalsIgnoreCase("Friday");
        if(isWeekDay){
            System.out.println("Weekday");
        }

        boolean isWeekendDay =  dayName.equalsIgnoreCase("Saturday") ||
                                dayName.equalsIgnoreCase("Sunday");
        if (isWeekendDay){
            System.out.println("Weekend Day");
        }


    }

}




