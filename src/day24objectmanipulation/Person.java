package day24objectmanipulation;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public String name;
    public String lastname;
    public List<Person> emailList;

    public Person(){
    }

    public Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getEmail(){
        return (this.name + this.lastname + "@gmail.com").replaceAll(" ","").toLowerCase();
    }


//    public static void main(String[] args) {
////     datatype  name        constructor
//        Person person1 = new Person();
//        System.out.println(person1.name);//null
//        System.out.println(person1.lastname);//null
//
//        Person person2 = new Person("Orcun","Kadioglu");
//        System.out.println(person2.name);//Orcun
//        System.out.println(person2.lastname);//Kadioglu
//
//    }
}