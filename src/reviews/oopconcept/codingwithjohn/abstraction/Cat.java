package reviews.oopconcept.codingwithjohn.abstraction;

public class Cat extends Animal implements AnimalStuff {

    public Cat(int age, String name) {
        super(age, name);
    }

    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        System.out.println("Cat poops!");
    }
}
