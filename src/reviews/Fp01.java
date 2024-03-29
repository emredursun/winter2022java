package reviews;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Fp01 {
    public static void main(String[] args) {
        /*
        Lambda is a functional programming, we have had Lambda in Java with version 8
        Functional programming focuses on "What to do", with structured programming we focus on "How to do"
        Functional programming is used just with Collections and Arrays
        We cannot use Maps directly in functional programming, but we can convert Maps to Sets and use them
        we can use entrySet()
         */
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
        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        getMaxElement01(l);
        System.out.println();
        getMaxElement02(l);
        System.out.println();
        maxOddLessThanSeventeen01(l);
        System.out.println();
        maxOddLessThanSeventeen02(l);
        System.out.println();
    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printElementsStructured(List<Integer> list){
        for(Integer w: list){
            System.out.print(w+" ");
        }
    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(functional)
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(t -> System.out.print(t + " "));
    }
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer> list){
        for (Integer w : list) {
            if(w % 2 == 0){
                System.out.print(w + " ");
            }
        }
    }
    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t-> t%2 !=0).map(t -> t*t).forEach(t -> System.out.print(t + " "));
    }// [8 9 131 10 9 10 2 8 15]
    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    //elements should be distinct (unique)
    //elements should be odd
    //elements printed as cube
    public static void printCubeOfDistinctElements(List<Integer> list){
        list.stream().distinct().filter(t -> t%2 != 0).map(t -> t*t*t).forEach(t -> System.out.print(t + " "));
    }
    //7)Create a method to find the maximum value from the list elements
    //1. way
    public static void getMaxElement01(List<Integer> list){
        Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u) -> t > u ? t : u);
        System.out.print(maxValue);
    }
    //2. way
    public static void getMaxElement02(List<Integer> list){
        Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u) -> u);
        System.out.print(maxValue);
    }
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    //more than 7, even, min value
    //1. way
    public static void getMinGreaterThanSeven01(List<Integer> list){
        Integer minGreaterThanSeven = list.stream().
                distinct().
                filter(t -> t > 7).
                filter(t -> t % 2 == 0).
                reduce(Integer.MAX_VALUE, (t,u) -> t > u ? u : t );
        System.out.println(minGreaterThanSeven);
    }
    //2. way
    public static void getMinGreaterThanSeven02(List<Integer> list){
        Integer minGreaterThanSeven = list.stream().distinct().
                filter( t -> t > 7).
                filter(t -> t % 2 == 0 ).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t,u) -> u);
        System.out.println(minGreaterThanSeven);
    }
    //3. way
    public static void getMinGreaterThanSeven03(List<Integer> list){
        Integer minGreaterThanSeven = list.stream().
                distinct().
                filter(t -> t > 7).
                filter( t -> t % 2 == 0 ).
                sorted().
                findFirst().
                get();
        System.out.println(minGreaterThanSeven);
    }
    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    //distinct, half of the elements, greater than 5, reverse, list
    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list){
        List <Double> newList = list.stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(newList);
    }
    //5)Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list){
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t ).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }
    //6)Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){
        Integer product = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t,u) -> t * u);
        System.out.println(product);
    }
    //7)Create a method to find the maximum value which is less than 17 and odd from the list
    //1.Way
    public  static void maxOddLessThanSeventeen01(List<Integer> list){
        Integer maxOddLessThanSeventeen = list.stream().
                distinct().
                filter(t -> t < 17).
                filter(t -> t%2 != 0).
                reduce(Integer.MIN_VALUE,(t,u) -> u);

        System.out.print(maxOddLessThanSeventeen);
    }
    // 2.Way
    public  static void maxOddLessThanSeventeen02(List<Integer> list){
        Integer maxOddLessThanSeventeen = list.stream().
                distinct().
                filter(t -> t < 17).
                filter(t -> t%2 != 0).
                sorted(Comparator.reverseOrder()).
                findFirst().get();

        System.out.print(maxOddLessThanSeventeen);
    }
}