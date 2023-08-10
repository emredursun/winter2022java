package day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap04 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Math", 9);
        hashMap.put("English", 8);
        hashMap.put("Biology", 7);
        hashMap.put("History", 6);
        hashMap.put("French", 7);
        System.out.println(hashMap);

        Set<Map.Entry<String, Integer>> entrySets = hashMap.entrySet();
        for (Map.Entry<String, Integer> eachEntrySet : entrySets){
            if (eachEntrySet.getValue() > 7){
                System.out.println(eachEntrySet.getKey() + " : " + eachEntrySet.getValue());
            }
        }
    }
}
