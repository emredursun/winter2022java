package day33mapsanditerators;

import java.util.HashMap;
import java.util.TreeMap;

public class Review01 {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Ali", 3000);
        treeMap.put("Tom", 500);
        treeMap.put("Alexandra", 12000);
        treeMap.put("Mark", 5000);
        treeMap.put("Angelina", 23000);
        treeMap.put("Walker", null);
        treeMap.put("Talker", null);

        System.out.println(treeMap);


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ali", 3000);
        hashMap.put("Tom", 500);
        hashMap.put("Alexandra", 12000);
        hashMap.put("Mark", 5000);
        hashMap.put("Angelina", 23000);
        hashMap.put("Walker", null);
        hashMap.put("Talker", null);

        System.out.println(hashMap);

        TreeMap<String, Integer> treeMap1 = new TreeMap<>(hashMap);
        System.out.println(treeMap1);

    }
}
