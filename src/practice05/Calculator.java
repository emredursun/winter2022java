package practice05;

public class Calculator {

    public void add(double... numbers){
        double result = 0;
        for(double each : numbers){
            result = result + each;
        }
        System.out.println("The sum is: " + result);
    }

    public void subtract(double a, double b){
        double result = a - b;
        System.out.println("The subtraction is: " + result);
    }

    public void multiply(double... numbers){
        double result = 1;
        for(double each : numbers){
            result = result * each;
        }
        System.out.println("The multiplication is: " + result);
    }

    public void divide(double a, double b){
        if(b == 0){
            System.out.println("I can not calculate that one...");
        } else {
            double result = a / b;
            System.out.println("The division is: " + result);
        }
    }
}
