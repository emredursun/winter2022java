package reviews.oopconcept.codingwithjohn.abstraction;

public class Bird extends Animal implements AnimalStuff {
    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Twit");
    }

    @Override
    public void poop() {
        System.out.println("Birds poop!");
    }
}
