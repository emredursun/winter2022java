package practice02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        /*
            Ask user to enter a name and a character,
              then check how many times the character is repeated
              in the name by using for loop(make code case-sensitive)
             Example:
             INPUT      :char ch1= 'a' ;
                         String name ="John came late";
             OUTPUT :  a is repeated 2 times in this String
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something...");
        String  userStr = scan.nextLine().toLowerCase();
        System.out.println("Enter a character to check how many times the character is repeated...");
        char userChar = scan.next().toLowerCase().charAt(0);

        int numRepeated = 0;

        for (int i=0; i<userStr.length(); i++){
            if (userChar == userStr.charAt(i)){
                numRepeated = numRepeated + 1;
            }
        }
        System.out.println(userChar + " is repeated " + numRepeated + " times in the String...");

    }
}
