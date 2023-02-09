package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensional02 {
    public static void main(String[] args) {
        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        //Print the elements which have “a” from a 2 dimensional String array

        for (String w[] : arr1){
            for(String m : w){

                if(m.contains("a")){
                    System.out.print(m + " ");
                }
            }
        }
        System.out.println("");
        System.out.println("=================");
        // Convert arr1 to one dimensional array.  { {"learn", "java", "it"}, {"is", "easy"} } ==>>  {"learn", "java", "it", "is", "easy"}
        // Find the total number of elements inner arrays
        int sum = 0;
        for(String[] w : arr1){
            sum = sum + w.length;
        }

        // Create one-dimensional array whose length equals to the total number of elements in main array
        String newArr[] = new String[sum];

        // Transfer elements from main Array to the new one-dimensional array
        int idx = 0;

        for(String[] w : arr1){
            for (String m : w){
                newArr[idx] = m;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr)); // [learn, java, it, is, easy]


    }
}
