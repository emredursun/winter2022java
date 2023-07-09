package reviews.oopconcept.alexlee.abstraction;

    interface DogInterface{
        void bark();
        void poop();
    }

    abstract class Dog implements DogInterface{

        public void bark() {
            System.out.println("Dogs bark!");
        }
        public abstract void poop ();
    }

    class Chihuahua extends Dog{

        @Override
        public void bark() {

        }
        @Override
        public void poop() {

        }
    }

    public class AbstractTutorial {
    public static void main(String[] args) {

        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();

    }
}
