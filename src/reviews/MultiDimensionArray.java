package reviews;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {

        // Convert arr1 to one dimensional array.  { {"learn", "java", "it"}, {"is", "easy"} } ==>>  {"learn", "java", "it", "is", "easy"}
        // Find the total number of elements inner arrays

        String[][] multiDimensionArray = {
                {"learn", "java", "it"},
                {"it", "easy"},
                {"make", "money", "by", "hardworking"}
        };

        int sizeOfArr = 0;

        for (String[] array : multiDimensionArray) {
            sizeOfArr = sizeOfArr + array.length;
        }

        String[] newArray = new String[sizeOfArr];

        int indx = 0;
        for (String[] array : multiDimensionArray){
            for (String str : array){
                newArray[indx] = str;
                indx++;
            }
        }

        System.out.println(Arrays.toString(newArray));
        System.out.println("New Array Length: " + newArray.length);


        // Find the maximum element in a two-dimensional array
        int[][] intArr = {
                {5, 0},
                {-5, 34},
                {65, 22, 31}
        };

        int maxElement = Integer.MIN_VALUE;

        for (int[] innerArr : intArr){
            for (int element : innerArr){
                if (maxElement < element){
                    maxElement = element;
                }
            }
        }
        System.out.println("The max element of the multi dimension array is " + maxElement);













    }
}
