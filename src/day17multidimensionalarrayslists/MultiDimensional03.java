package day17multidimensionalarrayslists;

public class MultiDimensional03 {
    public static void main(String[] args) {

        // Find the maximum element in a two-dimensional array
        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };
        int x = Integer.MIN_VALUE;
        for(int[] w : a){
            for(int m : w){
                if(x < m){
                    x = m;
                }
            }
        }
        System.out.println("Max value: " + x);





    }
}
