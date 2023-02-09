package day09forloopwhileloop;

import java.util.Scanner;

public class ReviewForLoop02 {
    public static void main(String[] args) {

//        // 1.Example: Put * between 2 consecutive characters and to the end in a String. For example; Java ==> J*a*v*a*
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your-input you want to rewrite by putting a character between 2 consecutive characters...");
//        String userInput = scan.nextLine();
//        System.out.println("Choose a character that you want to put between 2 consecutive characters...(*, #, etc...)");
//        String userChar = scan.next();
//        System.out.println("========== Output ==========");
//
//        for(int i=0; i < userInput.length(); i++){
//            System.out.print(userInput.charAt(i) + userChar);
//        }
        System.out.println("===================");

//        // 2.Example: Type code to print unique characters in a String. Hello ==> Heo
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an input to print only unique characters...");
//        String userString = scan.nextLine();
//
//        for(int i=0; i<userString.length(); i++){
//            if(userString.indexOf(userString.charAt(i)) == userString.lastIndexOf(userString.charAt(i))){
//                System.out.print(userString.charAt(i));
//            }
//        }

        System.out.println("===================");

        // 3.Example: Type code to print a String in reverse after removing spaces. For example; "Ali Can" ==> "naCilA"
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an input to print it out in reverse after removing spaces...");
        String userStr = scan.nextLine();
        String noSpaceStr = userStr.replace(" ", "");

        for (int i = noSpaceStr.length()-1; i>-1; i--){
            System.out.print(noSpaceStr.charAt(i));
        }


    }
}
