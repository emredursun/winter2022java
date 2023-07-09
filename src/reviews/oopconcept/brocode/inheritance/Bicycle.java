package reviews.oopconcept.brocode.inheritance;

public class Bicycle extends Vehicle {
     int pedals = 2;

    @Override
    public void go(){
        System.out.println("Bicycle Class");
        System.out.println("The bicycle is moving!");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle Class");
        System.out.println("The bicycle is stopped!");
    }

}
