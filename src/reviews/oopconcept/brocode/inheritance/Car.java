package reviews.oopconcept.brocode.inheritance;

public class Car extends Vehicle {

     int doors = 4;

    public int getDoors() {
        return doors;
    }

    @Override
    public void go(){
        System.out.println("Car Class");
        System.out.println("The car is moving!");
    }

    @Override
    public void stop() {
        System.out.println("Car Class");
        System.out.println("The car is stopped!");
    }
}
