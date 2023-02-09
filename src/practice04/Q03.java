package practice04;

public class Q03 {
    public static void main(String[] args) {
        /*
         * Create a method that can add the even numbers in the array
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         * OUTPUT : The sum of even numbers is  : 30
         */
        int array1[][] = {{1,3,6}, {2,8},{5,7,9,14}};
        int array2[][] = {{1,4,6}, {2,8},{5,7,10,14}};


        sumOfEven(array1);
        sumOfEven(array2);


    }

    public static void sumOfEven(int array[][]){
        int sumEven = 0;
        for(int m[] : array){
            for (int w : m){
                if (w % 2 == 0){
                    sumEven = sumEven + w;
                }
            }
        }
        System.out.println(sumEven);
    }
}
