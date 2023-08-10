package day31maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Review03 {
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
        System.out.println(hashMap01);

        Set<Integer> hashMapKeys = hashMap01.keySet();
        System.out.println("Keys : " + hashMapKeys); // Keys : [null, 100, 101, 102, 103, 104, 105, 106]

        Collection<String> hashMapValues = hashMap01.values();
        System.out.println("Values : " + hashMapValues); // Values : [Kemal, Ali, Veli, Aliye, Veliye, null, null, ]

        Set<Map.Entry<Integer, String>> setFormOfHashMap = hashMap01.entrySet();
        System.out.println(setFormOfHashMap); // [null=Kemal, 100=Ali, 101=Veli, 102=Aliye, 103=Veliye, 104=null, 105=null, 106=]
        for(Map.Entry<Integer, String> each : setFormOfHashMap){
            System.out.println(each.getKey() + " : " + each.getValue());
        }
    }
}
