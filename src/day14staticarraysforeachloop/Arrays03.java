package day14staticarraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {

        // Create an Array by getting array elements from user

        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements will you store inside the array?");
        int arrayLength = scan.nextInt();

        String strArray[] = new String[arrayLength];
        System.out.println(Arrays.toString(strArray));

        for (int i=0; i<arrayLength; i++){
            System.out.println("Enter a String...");
            strArray[i] = scan.next();
        }

        System.out.println(Arrays.toString(strArray));

    }

}
