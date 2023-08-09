package day26exception;

public class Review01 {
    public static void main(String[] args) {
        divide(12, 3);
        divide(0, 3);
        divide(12, 0);
    }

    // Not recommended
//    public static void divide(int a, int b) {
//        if(b==0){
//            System.out.printf("b can not be zero!");
//        } else {
//            System.out.println(a/b);
//        }
//    }

    public static void divide(int a, int b) {
        try{
            System.out.println( a / b );
        }  catch (ArithmeticException e) {
            System.out.println("Could not divide ==> " + e.getMessage());
        }
    }
}
