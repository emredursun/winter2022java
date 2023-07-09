package reviews.oopconcept.brocode.abstration;

public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have subclasses
        //            abstract methods are declared without an implementation

        // Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();


    }
}
