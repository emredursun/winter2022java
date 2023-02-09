package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        // How to create an Array and put elements in it in one line
        int a[] = {12, 3, 7, 5};
        System.out.println(Arrays.toString(a));

        int b[] = {12, 3, 7, 5};
        System.out.println(Arrays.toString(b));

        // How to check if two arrays are same or not
        // Note: If two arrays have same elements at the same indexes then arrays are same.
        boolean areArraysSame = Arrays.equals(a,b);
        System.out.println(areArraysSame);

        // Type code to check if 2 arrays have same elements
        for (int i=0; i<a.length; i++){
            for (int k=0; k<b.length; k++){
                if(a[i] != b[k]){
                    break;
                }
                System.out.println("They are not same arrays");
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("Same arrays");
        } else {
            System.out.println("Different arrays");
        }

        // Type code to check if a specific element exists in an array or not

        int num = 34;
        int counter = 0;

        int c[] = {-12, 21, 0, -2, 34};

        for (int w : c) {
            if (w==num){
                counter++;
                break;
            }
        }
        if (counter == 0){
            System.out.println(num + " does not exist in the array");
        } else {
            System.out.println(num + " exists in the array");
        }


    }
}
