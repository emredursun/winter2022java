package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        // I am creating integer variable whose name is age
        int age = 12;

        // I am creating a char variable whose name is initial
        char initial = 'A';

        // Lets print the values of age and initial variables on the console
        System.out.println(age); //12

        System.out.println(initial); //A

        //Create 3 integer variables, assign values to them
        // a) print them on the console one by one
        int a = 3, b = 5, c = 7;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // b) Print the sum of the 3 integers
        System.out.println(a + b + c);

        // c) Print the sum of the integers by a label at the beginning. Example: 'The sum is 15'
        System.out.println("The sum is " + a + b + c);  // The sum is 357
        // This console not right, because of "+" Concatenation Operation

        // You can see the good solution bellow.
        int sum = a + b + c;
        System.out.println("The sum is " + sum);
        // Or
        System.out.println("The sum is " + (a + b + c));

        // Create 2 integer variables and print their multiplication on the console with a label
        int x = 2, y = 4;
        int z = x * y;
        System.out.println("Multiplication is " + z);

        /*
        You can write whatever you want!
         */




    }

}
