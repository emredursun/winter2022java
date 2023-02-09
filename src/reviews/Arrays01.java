package reviews;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

        //Sort the array elements in descending order according to their lengths.
        //If some elements are in the same length put them in alphabetical order

        String strArr[] = {"Emre", "Dursun", "Ramazan", "Hasan", "Cemile", "Merve"};
        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(strArr));


        // Create a String array and print the elements in alphabetical order on  the console in different lines
        // 1.Step: Create a String Array
        String myArray01[] = {};




    }

}
