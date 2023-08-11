package day33mapsanditerators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Review04 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Ali");
        set.add("Veli");
        set.add("Ayse");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
