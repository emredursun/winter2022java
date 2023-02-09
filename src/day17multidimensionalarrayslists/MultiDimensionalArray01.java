package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    // If you use arrays as elements in an array then it is called "multidimensional array"

    public static void main(String[] args) {

        // How to create multidimensional array
        int mda1[][] = new int[3][2];

        // How to print multidimensional array on the console
        System.out.println(Arrays.deepToString(mda1));

        // How to assign values
        mda1[0][0] = 11;
        mda1[0][1] = 9;
        mda1[1][0] = 5;
        mda1[1][1] = 4;
        mda1[2][0] = 1;
        mda1[2][1] = 21;
        System.out.println(Arrays.deepToString(mda1)); // [[11, 9], [5, 4], [1, 21]]

        System.out.println("==========================");

        // How to create multidimensional array in short way
        int mda2[][] = {{2, 3},  {12},  {21, 34, 56}, {4}}; // [[2, 3], [12], [21, 34, 56], [4]]
        System.out.println(Arrays.deepToString(mda2));

        // How to print a specific array on the console
        System.out.println(Arrays.toString(mda2[2])); // [21, 34, 56]
        System.out.println(Arrays.toString(mda2[0])); // [2, 3]

        // How to find the number of element in a multidimensional array.  Example: [[2, 3], [12], [21, 34, 56], [4]] => 7
        int sum = 0;
        for (int[] w : mda2) {
            sum = sum + w.length;
        }
        System.out.println("sum: " + sum);

    }

}
