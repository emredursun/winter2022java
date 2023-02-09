package day24abstractclass;

public class Sheep extends Herbivorous {
    @Override
    public void eat() {
        System.out.println("Sheeps eat vegetables...");
    }

    @Override
    public void noMeat() {
        System.out.println("Sheeps eat not meat...");
    }
}
