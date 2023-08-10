package day32maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

    /*
        # When we use Maps, we can just print them on the console as a map
        # When we use Maps, we can use ketSet() method to have only Keys of the map
        # When we use maps, we can use values() method to have only Values of the map
        # When we want to have all Key and Value entries, we can use entrySet() method to have Key and/or Value pairs of the map
        # When we want to get a specific value from a map, we use get() method


     */

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap01 = new HashMap<>();
        hashMap01.put("MATH", 8);
        hashMap01.put("JAVA", 9);
        hashMap01.put("SDLC", 9);
        hashMap01.put("API", 7);

        System.out.println("All Keys : " + hashMap01.keySet()); // returns Set
        System.out.println("All Values : " +  hashMap01.values()); // returns Collection
        System.out.println("All Key and Value Sets : " + hashMap01.entrySet()); // returns Set<Map.Entry<K,V>>
        System.out.println("API : " + hashMap01.get("API")); // returns String

        // KEYS
        Set<String> setOfKeys =  hashMap01.keySet(); // returns Set
        for (String eachKey : setOfKeys){
            System.out.println(eachKey);
        }

        // VALUES
        Collection<Integer> collectionOfValues = hashMap01.values(); // returns Collection
        for (Integer eachValue : collectionOfValues){
            System.out.println(eachValue);
        }

        // ENTRY SET
        Set<Map.Entry<String, Integer>> setFormOfHashMap = hashMap01.entrySet(); // returns Set of Entries (Key and Value pair)
        for (Map.Entry<String, Integer> eachSet : setFormOfHashMap){
            // If we want to see JAVA result
//            if(eachSet.getKey().equalsIgnoreCase("JAVA")){
//                System.out.println("JAVA : " + eachSet.getValue());
//            }

            if (eachSet.getValue() > 8){
                System.out.println(eachSet.getKey() + " : " + eachSet.getValue());
            }
//            System.out.println(eachSet.getKey() + " : " + eachSet.getValue());
        }

        System.out.println("JAVA : " + hashMap01.get("JAVA"));


//        Object email = getEamil("emre","dursun");
//        System.out.println(email);
//
//        double num = 28;
//        int num2 = (int) num;
//
//        Object num3 = 3;
//        num2 = (int)num3;

    }

    public static String getEamil(String firstName, String lastName){
        return firstName + lastName + "@gmail.com";
    }
}
