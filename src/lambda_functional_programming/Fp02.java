package lambda_functional_programming;
import java.util.ArrayList;
import java.util.List;
public class Fp02 {
    /*
    In functional programming we use Lambda expressions, but when we use method reference, Lambda expressions
    will not be recommended
    When we use method reference we have " Class name :: method name" Be careful about () -> no need
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);
        printElementsFunctional(l);
        System.out.println();

    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(functional)
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach( Utils :: printInSameLineWithSpace);
    }
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(Utils :: checkToBeEven).forEach(Utils :: printInSameLineWithSpace);
    }                          // t -> t % 2 == 0
    //Create a method that prints all the numbers more than 8 on th =e console
//    public static void getNumbersMoreThanEight(List<Integer> list){
//        list.stream().filter(Utils :: getMoreThanEight).forEach(Utils :: printInSameLineWithSpace);
//    }



}