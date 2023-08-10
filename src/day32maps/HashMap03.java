package day32maps;

import java.util.HashMap;

public class HashMap03 {
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

        int valueOfSDLC = hashMap01.replace("SDLC", 10);
        System.out.println("Older Value of SDLC : " + valueOfSDLC);
        if(valueOfSDLC == 9){
            System.out.println("The operation is successful!");
            System.out.println("New value od SDLC : " + hashMap01.get("SDLC"));
        } else {
            System.out.println("The operation is failed!");
        }
        System.out.println(hashMap01);

        // This meth will take key and value and it will check 2 condition. If 2 conditions are true
        // Then it will replace the value, otherwise, it will not make changes
        boolean isTrue = hashMap01.replace("API", 7,10);
        System.out.println(isTrue);
        System.out.println(hashMap01);

        // How to remove element from a Map
        int valueOfMATH = hashMap01.remove("MATH");
        System.out.println(valueOfMATH);
        System.out.println(hashMap01);

        boolean isDone = hashMap01.remove("SDLC", 10);
        System.out.println(isDone);
        System.out.println(hashMap01);
    }
}
