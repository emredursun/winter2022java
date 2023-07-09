package day24objectmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Runner04 {

    public static void main(String[] args) {

       /*
    Create 3 person object
    Then create a method to concatenate the names with lastnames and add also "@gmail.com"
    Finally print them on the console
     */

        List<Person> peopleList = new ArrayList<>();
        Person person1 = new Person("Kubra", "Tekin");
        Person person2 = new Person("Serjan", "Iskrenov");
        Person person3 = new Person("Ali", "Bingul");

        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);

        System.out.println(peopleList);
        System.out.println(peopleList.size());

        System.out.println(getEmails(peopleList));

        printEmails(getEmails(peopleList));
    }

    public static List<String> getEmails(List<Person> peopleList){
        List<String> emailList = new ArrayList<>();
//       for(String x : list)
        for(Person person : peopleList){
            emailList.add((person.name + person.lastname + "@gmail.com").replaceAll(" ", "").toLowerCase());
        }
        return emailList;
    }

    public static void printEmails(List<String> emailsList){
        int count = 1;
        for (String s : emailsList) {
            System.out.println(count + ". Email: " + s);
            count++;
        }
    }

}