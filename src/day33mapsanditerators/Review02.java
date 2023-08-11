package day33mapsanditerators;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Review02 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Object element = listIterator.next();
            listIterator.set(element + "XXX");
        }
        System.out.println(list);

        while (listIterator.hasPrevious()){
            Object obj = listIterator.previous();
            System.out.println(obj);
        }

        ListIterator<String> listIterator1 = list.listIterator();
        while (listIterator1.hasNext()){
            Object element = listIterator1.next();
            if (element.toString().contains("B")){
                listIterator1.remove();
            }

            if (element.toString().contains("A")){
                listIterator1.set("API");
            }
        }
        System.out.println(list);

    }
}
