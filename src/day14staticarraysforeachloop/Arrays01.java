package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    // Java creates Arrays structures to be able to store multiple data in it.
    // You can store multiple in an Array, but they should be in the same data type
    // To create an Array you must inform Java about the number of data you want to store in the array

    public static void main(String[] args) {

        int myArray[] = new int[5];

        // How to print an array on console
        System.out.println(Arrays.toString(myArray)); // [0, 0, 0, 0, 0]

        // How to assign a value to a specific array element

        myArray[0] = 41;
        myArray[1] = 11;
        myArray[3] = 21;
        myArray[4] = 1;
        System.out.println(Arrays.toString(myArray)); // [41, 11, 0, 21, 1]

        // How to print a specific on the console
        System.out.println(myArray[1]); // 11

        // How to get the number of elements in an array

        // Note: We were using length() in String class, we will use only "length" in Arrays class
        int numOfElements = myArray.length;
        System.out.println(numOfElements); // 5


        // Print the sum of the first and the last element in an array

        int firstElement = myArray[0];
        int idxOfLastElement = myArray.length - 1;
        int lastElement = myArray[idxOfLastElement];
        int sumOfElements = firstElement + lastElement;

        System.out.println(sumOfElements); // 42

        // Find sum of all elements in an Array

        int sum = 0;
        for (int i=0; i<myArray.length; i++){
            sum = sum + myArray[i];
        }
        System.out.println(sum);

        // 2.Way: Use while loop
        // 3.Way: Use do-while loop

        // 4.Way: Use for-each loop. for-each loop can be used collections and arrays

        int sumOfAllElements = 0;
        for (int w : myArray) {
            sumOfAllElements = sumOfAllElements + w;
        }
        System.out.println(sumOfAllElements);



    }

}
