package day25overriding;

public class Cat extends Mammal{

    @Override // Annotation
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public void feedBabyWithMilk() {
        System.out.println("Cats feed their baby by milk");
    }

    public void meow(){
        System.out.println("Cats meow");
    }
}
