package day33mapsanditerators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Review03 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Object each = listIterator.next();
            System.out.println(each);
        }

        while (listIterator.hasPrevious()){
            Object each = listIterator.previous();
            System.out.println(each);
        }

    }
}
