package day32maps;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HashTable01 {
    public static void main(String[] args) {

        /*
            # HashTable is also a Map
            # HashTable is thread-safe and synchronized
            # HashTable does not accept any null key nor value
            # HashTable does not put the elements in naturel order
            # HashTable is slower than HashMap

         */

        Hashtable<String, Integer> hashtable01 = new Hashtable<>();
        hashtable01.put("Ali", 300);
        hashtable01.put("Tom", 500);
        hashtable01.put("Alexandra", 12000);
        hashtable01.put("Mark", 5000);
        hashtable01.put("Angelina", 23000);
//        hashtable01.put(null, 200); // Null Key is not allowed in HashTable
//        hashtable01.put("Value", null); // Null Value is not allowed in HashTable

        System.out.println(hashtable01);
        System.out.println(hashtable01.containsKey("Mark"));
        System.out.println(hashtable01.containsValue(12000));

        Hashtable<String, Integer> hashtable02 = new Hashtable<>();
        hashtable02.put("Ali", 300);
        hashtable02.put("Tom", 500);
        hashtable02.put("Alexandra", 12000);
        hashtable02.put("Mark", 5000);
        hashtable02.put("Angelina", 23000);

        System.out.println(hashtable01.equals(hashtable02)); // When we check the element of 2 maps, it will not check the order, but just values
        System.out.println(hashtable02.isEmpty()); // This will check if the map has elements or not




    }
}
