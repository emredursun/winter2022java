package day17multidimensionalarrayslists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        /*
        *   1) When you create an array you have to declare the length otherwise you can not create an array
        *   2) After declaring the length it is impossible to store more elements in it, this is not good.
        *   3) Java created another structure to store multiple elements, it is "ArrayLists".
        *       ArrayLists are flexible in length. It means while you create an ArrayList no need to declare the length.
        *       After creating ArrayList you may store any number of elements, there is no any restriction about it.
        *   4) Array can contain "primitive" data types and "references" but ArrayLists can contain just "non.primitive" data types
        *       Int ==> Array but Integer ==> ArrayList
        * */

        // How to create an ArrayList
        // 1.Way:
        ArrayList<Integer> al1 = new ArrayList<>();


        // 2.Way:
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        // 3:way:
        List<Integer> al3 = new ArrayList<>();

        // How to print an ArrayList on the console
        System.out.println(al1);

        // How to add elements into a ArrayList
        // Add method puts the elements in ArrayList according to the insertion order
        al1.add(11);
        al1.add(12);
        al1.add(5);
        al1.add(1, 99);
        System.out.println(al1); // [11, 99, 12, 5]

        // How to get the number of elements in an ArrayList
        int numOfElements = al1.size();
        System.out.println(numOfElements); // 4
        System.out.println(al2.size()); // 0

        // Note: When you talk about the number of elements in an "Array" tell "Array length"
        // Note: When you talk about the number of elements in an "ArrayList" tell "List size"

        // How to check if an ArrayList is empty or not
        // 1.Way:
        if (al1.size()==0){
            System.out.println("It is empty!");
        } else {
            System.out.println("It is not empty!");
        }

        // 2.Way
        if (al2.isEmpty()){
            System.out.println("It is empty!");
        } else {
            System.out.println("It is not empty!");
        }

        // How to check if an ArrayList is has just space in it
        List<String> al4 = new ArrayList<>();
        al4.add(" ");
        al4.add("a");

        for(String w : al4){
            if(w.equals(" ")){
                System.out.println("There is space");
                break;
            }
        }


        // Create an String ArrayList add 5 elements into it, remove a specific elements
        ArrayList<String> al5 = new ArrayList<>();
        al5.add("Understand");
        al5.add("Happy");
        al5.add("Henk");
        al5.add("Mariaana");
        al5.add("Tom");
        System.out.println(al5);


        al5.remove("Henk"); // It will return boolean. True => mission completed - False =>  could not remove
        System.out.println(al5);

        // How to remove an element by index
        al5.remove(1); // It will return the removed element to double-check
        System.out.println(al5);


        // Create an Integer ArrayList, add 5 elements into it, remove a specific element
        ArrayList<Integer> al6 = new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);
        System.out.println(al6); // [12, 13, 7, 32, 1]


        // When you have Integers to remove, you have to use remove() method with index, remove() methodwith the lement can not be used
        al6.remove(1);
        System.out.println(al6); // [12, 7, 32, 1]


        // How to remove a specific integer element from an integer list

        // 1.Step: Create an Integer Wrapper Class Object by using the value which ou want to remove
        Integer el = Integer.valueOf(32);

        // 2.Step: Use the created Integer object inside the remove()
        al6.remove(el);
        System.out.println(al6); // [12, 7, 1]


        // Create a String ArrayList, add 5 elements into it, remove the elements whose lengths are less than 5
        ArrayList<String> al7 = new ArrayList<>();
        al7.add("Understand");
        al7.add("Happy");
        al7.add("Henk");
        al7.add("Mariaana");
        al7.add("Tom");
        System.out.println(al7); // [Understand, Happy, Henk, Mariaana, Tom]

        // Clone the al7 and use the cloned ArrayList inside the loop
        List<String> clonedal7 = new ArrayList<>(al7);

        for(String w : clonedal7){
            if(w.length() < 5){
                al7.remove(w);
            }
        }
        System.out.println(al7); // [Understand, Happy, Mariaana]



    }
}
