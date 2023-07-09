package reviews;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        // 1.Way
        ArrayList<Integer> arrList1 = new ArrayList<>();

        // 2.Way
        List<Integer> arrList2 = new ArrayList<>();

        // How to add elements to an ArrayList
        arrList2.add(11);
        arrList2.add(12);
        arrList2.add(5);

        // How to print an ArrayList on the console
        System.out.println(arrList2); // [11, 12, 5]

        arrList2.add(0, 3);
        arrList2.add(2, 7);
        System.out.println(arrList2); // [3, 11, 7, 12, 5]

        int numOfElements = arrList2.size();
        System.out.println(numOfElements);

        List<String> arrList3 = new ArrayList<>();
        arrList3.add("How is it going!");
        for(String str : arrList3){
            if(str.contains(" ")){
                System.out.println("There is a space!");
                break;
            }
        }

        List<String> arrList4 = new ArrayList<String>();
        arrList4.add("Understand");
        arrList4.add("Happy");
        arrList4.add("Henk");
        arrList4.add("Mariaana");
        arrList4.add("Tom");
        System.out.println(arrList4);

        arrList4.removeIf(str -> str.length() < 5);
        System.out.println(arrList4);


        List<String> arrList5 = new ArrayList<String>();
        arrList5.add("Understand");
        arrList5.add("Happy");
        arrList5.add("Henk");
        arrList5.add("Mariaana");
        arrList5.add("Tom");
        System.out.println(arrList5); // [Understand, Happy, Henk, Mariaana, Tom]

        // Clone the arrList5 and use the cloned ArrayList inside the loop

        List<String> clonnedArrList5 = new ArrayList<>(arrList5);

        for (String str : clonnedArrList5){
            if (str.length() < 5){
                arrList5.remove(str);
            }
        }

        System.out.println(arrList5); // [Understand, Happy, Mariaana]








    }
}
