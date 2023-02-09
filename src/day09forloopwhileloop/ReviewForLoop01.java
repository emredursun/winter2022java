package day09forloopwhileloop;

import java.util.Scanner;

public class ReviewForLoop01 {
    public static void main(String[] args) {

        // 1.Example: Write a code to print the user-entered input on the console as many times as the user wants.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your-input you want to write to the console...");
        String userInput = scan.nextLine();
        System.out.println("How many times would you like to print your input on the console? (1, 2, 3,..)");
        int numOfPrint = scan.nextInt();
        System.out.println("========== Output ==========");

        for(int i=1; i < numOfPrint+1; i++){
            System.out.println(i + ". " + userInput);
        }

        // 2.Example: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

        for (int i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

    }
}
