package day31maps;

import java.util.*;

public class Review02 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap01 = new HashMap<>();

        hashMap01.put(100, "Ali");
        hashMap01.put(101, "Veli");
        hashMap01.put(102, "Aliye");
        hashMap01.put(103, "Veliye");
        hashMap01.put(null, "Henk");
        hashMap01.put(null, "Kemal");
        hashMap01.put(104, null);
        hashMap01.put(105, null);
        hashMap01.put(106, "");

        hashMap01.putIfAbsent(102, "P");
        hashMap01.putIfAbsent(999, "ZZZ");

        System.out.println(hashMap01);

        String valueof101 = hashMap01.get(101);
        System.out.println("101 : " + valueof101);

        String valueOf444 = hashMap01.get(444);
        System.out.println("444 : " + valueOf444);

        String valueOf666 = hashMap01.getOrDefault(666, "There is no a key like that!");
        System.out.println(valueOf666);

        HashMap<Integer, String> hashMap02 = new HashMap<>();
        hashMap02.put(87, "X");
        hashMap02.put(88, "K");
        hashMap02.put(89, "L");

        hashMap01.putAll(hashMap02);

        System.out.println(hashMap01); // {null=Kemal, 100=Ali, 101=Veli, 102=Aliye, 103=Veliye, 999=ZZZ, 87=X, 104=null, 88=K, 105=null, 89=L, 106=}


        Set<Integer> myKeys = hashMap01.keySet();
        System.out.println("Keys : " + myKeys); // [null, 100, 101, 102, 103, 999, 87, 104, 88, 105, 89, 106]

        Collection<String> myValues = hashMap01.values();
        System.out.println("Values : " + myValues); // [Kemal, Ali, Veli, Aliye, Veliye, ZZZ, X, null, K, null, L, ]

        Set<Map.Entry<Integer, String>> setForm = hashMap01.entrySet();
        System.out.println(setForm); // [null=Kemal, 100=Ali, 101=Veli, 102=Aliye, 103=Veliye, 999=ZZZ, 87=X, 104=null, 88=K, 105=null, 89=L, 106=]

        for(Map.Entry<Integer, String> each : setForm){
            System.out.print("key : " + each.getKey()); // This gives key and value separately
            System.out.print(" & ");
            System.out.println("value : " + each.getValue());
        }

        System.out.println(hashMap01);

    }
}
