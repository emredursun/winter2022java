package day25overriding;

public class Dog extends Mammal{

    @Override // This is Annotation and checks the overriding rules.
                // If
    public void eat() {
        System.out.println("Dogs eat");
    }

    @Override
    public void drink() {
        System.out.println("Dogs drink");
    }

    public void bark(){
        System.out.println("Dogs bark");
    }
}
