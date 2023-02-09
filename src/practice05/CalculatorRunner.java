package practice05;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(2,3,5);
        System.out.println("========================");
        calculator.subtract(2,3);
        System.out.println("========================");
        calculator.multiply(2,3,5);
        System.out.println("========================");
        calculator.divide(2,3);
        calculator.divide(2,0);
    }
}
