package day30_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Review01 {
    public static void main(String[] args) {

        Long time01 = System.nanoTime();
        TreeSet<Integer> treeSet01 = new TreeSet<>();
        treeSet01.add(12);
        treeSet01.add(35);
        treeSet01.add(10);
        treeSet01.add(3);
        System.out.println(treeSet01);
        Long time02 = System.nanoTime();

        TreeSet<String> treeSet02 = new TreeSet<>();
        treeSet02.add("K");
        treeSet02.add("Z");
        treeSet02.add("A");
        treeSet02.add("C");
        treeSet02.add("T");
        System.out.println(treeSet02);

        Long time03 = System.nanoTime();
        HashSet<String> hashSet01 = new HashSet<>();
        hashSet01.add("K");
        hashSet01.add("Z");
        hashSet01.add("A");
        hashSet01.add("C");
        hashSet01.add("T");
        System.out.println(hashSet01);

        TreeSet<String> treeSet03 = new TreeSet<>(hashSet01);
        System.out.println(treeSet03);
        Long time04 = System.nanoTime();

        System.out.println(time02 - time01);
        System.out.println(time04 - time03);

    }


}
