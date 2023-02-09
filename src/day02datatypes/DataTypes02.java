package day02datatypes;

public class DataTypes02 {

    public static void main(String[] args) {

        // Create a char variable and print it on the console.
        // Every character has a integer value in IT area! Those values are called ASCII Values!
        // Note: If you use any char in a mathematical operation, Java uses its ASCII value in the operation!
        char x = 'A'; // ASCII value of 'A' is 65. The lower case ASCII value of 'a' is 97.
        System.out.println(x + 1); // 66

        // Type code to finde the ASCII Value of "!"
        char asciiValueOf = '!'; // ASCII value of '!' is 33.
        System.out.println(asciiValueOf + 0);

        // Type code to find the some of the ASCII values of 'X' and 'y' and '?'

        char ascii1 = 'X', ascii2 = 'y', ascii3 = '?';
        System.out.println(ascii1 + ascii2 + ascii3); // 272

        // Create 2 integer variables whose values are 5 and 2 then print the result of first is divided by second.
        // If you use just int data type in mathematical operations the result will be in int data type.
        // In the result, Java will remove decimal part and return just the whole number.

        int firstNum = 8, secondNum = 3;
        System.out.println((firstNum / secondNum));


        // When you use different data types in mathematical operations the result will be in the largest data type.
        // Because of that the result data type will be double.

        double thirdNum  = 5;
        int fourthNum = 2;
        System.out.println(thirdNum/fourthNum); // 2.5


        // In how many ways you can fix the following issue?
        // 1.Way:
        float z = 2.5F;

        //2.Way:
        double r = 2.5;

        //  What is the output of the followings?

        System.out.println(2 + 3 + "Ali"); //5Ali
        System.out.println(2 + 'a' + "A" + (3 + 4)); //99B7

    }

}
