package reviews.oopconcept.codingwithjohn.abstraction;

public class AbstractClass {
    public static void main(String[] args) {

        Cat myCat = new Cat(2, "Prenses");

        System.out.println("My cat name is " + myCat.name);
        myCat.makeNoise();

        Bird myBird = new Bird(3, "Kemal");
        myBird.makeNoise();

    }
}
