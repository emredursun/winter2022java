package day31maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Review01 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Ali");
        hashMap.put(101, "Veli");
        hashMap.put(102, "Aliye");
        hashMap.put(103, "Halime");
        hashMap.put(null, "Henk"); // You can enter multiple "NULL" keys, but it accepts just the last one
        hashMap.put(null, "Kemal");
        hashMap.put(104, null);
        hashMap.put(105, null);
        hashMap.put(106, "");
        System.out.println(hashMap);

        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(100, "Ali");
        hashtable.put(101, "Veli");
        hashtable.put(102, "Aliye");
        hashtable.put(103, "Halime");
//        hashtable.put(null, "Henk"); // You can not enter "NULL" keys
//        hashtable.put(105, null); // You can not enter "NULL" values
        hashtable.put(106, "");
        System.out.println(hashtable);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(115, "Ali");
        treeMap.put(111, "Veli");
        treeMap.put(102, "Aliye");
        treeMap.put(105, "Halime");
//        treeMap.put(null, "Henk"); // You can not enter "NULL" keys
//        treeMap.put(105, null); // You can not enter "NULL" values
        treeMap.put(100, "");
        System.out.println(treeMap);
    }
}
