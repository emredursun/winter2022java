package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatementQuestions {
    public static void main(String[] args) {

        /*  1)
            If the user pressed 1, 2, 3 the program will print the number that is pressed; otherwise, program will print "Not allowed".
        */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number... (Valid Numbers: 1, 2, 3)");
//        Byte userInput = scan.nextByte();
//        switch (userInput){
//            case 1:
//                System.out.println("You pressed " + userInput);
//                break;
//            case 2:
//                System.out.println("You pressed " + userInput);
//                break;
//            case 3:
//                System.out.println("You pressed " + userInput);
//                break;
//            default:
//                System.out.println("Not allowed");
//                break;
//        }



        /*  2)
            Write a Java program user will choose answer among A, B, C, or D.
            If the answer is true, output will be “True.” If the answer is false, output will be
            “False”. Correct answer is ‘C’ for the multiple option question.
        */
        System.out.println("Who assassinated one of the US presidents, John Fitzgerald Kennedy?");
        System.out.println
                (
                        "A) Jack Ruby"          + "\n" +
                        "B) Clay Shaw"          + "\n" +
                        "C) Lee Harvey Oswald"  + "\n" +
                        "D) Sedat Peker"
                );
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.nextLine().toLowerCase();
        char answer = userAnswer.charAt(0);

        switch (answer){
            case 'a':
                System.out.println("False");
                break;
            case 'b':
                System.out.println("False");
                break;
            case 'c':
                System.out.println("True");
                break;
            case 'd':
                System.out.println("False");
                break;
            default:
                System.out.println("You entered an invalid data!");
                break;
        }



        /* 3)
            Type java code by using switch statement.
            A school has following rules for grading system:
            1. For 50 - C 2. For 80 - B. 4. For 100 - A
            Ask user to enter marks and print the corresponding grade.
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your mark to calculate its corresponding grade... (Valid Range: 0 - 100)");
//        byte userInput = scan.nextByte();
//        switch (userInput){
//            case 50:
//                System.out.println("C");
//                break;
//            case 80:
//                System.out.println("B");
//                break;
//            case 100:
//                System.out.println("A");
//                break;
//            default:
//                System.out.println("Invalid data entered!");
//                break;
//        }


        /*  4)
            Ask user to enter one of the ‘U’, ’S’, and ‘A’.
            Then type a program by using “switch statement” to print “United” for ‘U’
            ”States” for ’S’, and “America” for ‘A’
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter one of the ‘U’, ’S’, and ‘A’");
//        char userInput = scan.next().charAt(0);
//        switch (userInput){
//            case 'U':
//                System.out.println("United");
//                break;
//            case 'S':
//                System.out.println("States");
//                break;
//            case 'A':
//                System.out.println("America");
//                break;
//            default:
//                System.out.println("Invalid data entered!");
//                break;
//        }
    }
}
