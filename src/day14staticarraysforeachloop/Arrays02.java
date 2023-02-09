package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Create a String array and print the elements in alphabetical order on  the console in different lines
        // 1.Step: Create a String Array

        String myStringArray[] = new String[4];
        System.out.println(Arrays.toString(myStringArray)); // [null, null, null, null]

        // 2.Step: Add elements in to the array

        myStringArray[0] = "Veli";
        myStringArray[1] = "Can";
        myStringArray[2] = "Beyhan";
        myStringArray[3] = "Ali";
        System.out.println(Arrays.toString(myStringArray)); // [Veli, Can, Beyhan, Ali]

        // How to put the elements in alphabetical order
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));

        // How to print the elements in different lines
        for (String w: myStringArray) {
            System.out.println(w);
        }

        System.out.println("=====================");

        // Print the list element if the number of character is less than 4
        for (String w: myStringArray) {
            if(w.length() < 4)
            {
                System.out.println(w);
            }
        }

        System.out.println("=====================");

        // Print the list elements if you print "Can" stop printing
        for (String w : myStringArray){
            System.out.println(w);
            if (w.equals("Can")){
                break;
            }
        }

        System.out.println("=====================");

        // Print the list elements excepts "Can" if there is.
        // 1. Way:
        for (String w : myStringArray){
            if (!w.equals("Can")){
                System.out.println(w);
            }
        }

        System.out.println("=====================");

        // 1. Way:
        for (String w : myStringArray){
            if (w.equals("Can")){
                continue; // Skips element/s under some conditions
            }
            System.out.println(w);
        }

    }

}
