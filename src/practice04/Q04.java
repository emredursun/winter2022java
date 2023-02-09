package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

            /*
                Ask user to enter an integer, and create a squared multidimensional Array
                 Example: If user enters 3 ==> [[3, 3, 3],[3, 3, 3],[3, 3, 3]]
                 If user enters 4 ==> [[4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4]]
           */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to create a squared multidimensional Array...");
        int arraySize = scan.nextInt();

        if(arraySize < 0){
            System.out.println("Please enter a positive number...");
        } else {
            int array[][] = new int[arraySize][arraySize];

            for (int i=0; i<arraySize; i++){
                for (int j=0; j<arraySize; j++){
                    array[i][j] = arraySize;
                }
            }
            System.out.println(Arrays.deepToString(array));

        }




    }

}
