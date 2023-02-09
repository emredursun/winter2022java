package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
         /*
            A list has elements "M", "K" and "P"
            Ask user to enter a letter
            If the letter exists in list convert it to "Got it"
            otherwise list will stay same
          */

        List<String> strList = new ArrayList<>();
        strList.add("M");
        strList.add("K");
        strList.add("P");
        System.out.println(strList); // [M, K, P]

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter...");
        String userLetter = scan.next().toUpperCase();

        if(strList.contains(userLetter)){
            strList.set(strList.indexOf(userLetter), "Got it");
        } else {
            strList.add(userLetter);
        }
        System.out.println(strList);



    }
}
