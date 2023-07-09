package reviews.oopconcept.codingwithjohn.polymorphism;


public class Polymorphism {
    public static void main(String[] args) {

        // Overriding
        System.out.println("++++++++++++++++++++++++++++\n" + "Overriding\n"+ "++++++++++++++++++++++++++++");

        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat();

        Cat myCat = new Cat();
        myCat.eat();

        // Overloading
        System.out.println("++++++++++++++++++++++++++++\n" + "Overloading\n"+ "++++++++++++++++++++++++++++");

        myCat.eat();
        myDog.eat(5);
    }
}
