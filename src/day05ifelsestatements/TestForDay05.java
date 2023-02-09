package day05ifelsestatements;

public class TestForDay05 {
    public static void main(String[] args) {
        String a = "java";

        String b = "JAVA";

        if(a.equals(b)) {

            System.out.println(a);

        }else if(!(a.equals(b))) {

            System.out.println(b);

        }


        int x = 9;

        if(x<100){

            System.out.println("Good");

        }else if(x<10){

            System.out.println("Bad");

        }

        int y = 22;
        if(y % 3 == 0){

            System.out.println("The number is divisible by 3");

        }else if(y % 3 == 1){

            System.out.println("The number is not divisible by 3, the remainder is 1");

        }else{

            System.out.println("The number is not divisible by 3, the remainder is 2");

        }
    }
}
