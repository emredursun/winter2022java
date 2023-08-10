package day32maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashTable02 {
    public static void main(String[] args) {
                /*
            How to count the number of occurrences of the worlds in a sentence
            For example: "Java is easy. Type codes to learn Java. To earn money learn Java."
                          Java=3, is=1, type=1; ..., learn=2, ...
         */

        String sentence = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        sentence = sentence.replaceAll("\\p{Punct}", ""); // get rid of punctuation
        System.out.println(sentence);
//        String[] words = sentence.split(" ");
//        System.out.println(Arrays.toString(words));
        List<String> words = List.of(sentence.split(" "));
        System.out.println(words);
        HashMap<String, Integer> wordsOfSentence = new HashMap<>();
        for(String each : words){
            Integer numOfOccurrences = wordsOfSentence.get(each.toLowerCase());
            if(numOfOccurrences == null){
                wordsOfSentence.put(each.toLowerCase(),1);
            } else{
                wordsOfSentence.replace(each.toLowerCase(), numOfOccurrences + 1);
            }
        }
        System.out.println(wordsOfSentence);
    }
}
