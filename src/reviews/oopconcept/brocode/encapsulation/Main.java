package reviews.oopconcept.brocode.encapsulation;

public class Main {
    public static void main(String[] args) {


//        Encapsulation =   attributes of a class will be hidden or private,
//                          Can be accessed only through methods (getters & Setters)
//                          You should make attributes private if you do not have a reason to make them public/protected

        Car car = new Car("BMW", "320i", 2011);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setMake("Audi");
        car.setModel("R8");
        car.setYear(2023);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


//        Bicycle bicycle = new Bicycle("Gazele", "City Bike G200", 2021);
//        System.out.println(bicycle.getMake());
//
//        bicycle.setMake("Bianchi");
//        bicycle.setModel("Racer B500");
//        bicycle.setYear(2023);
//
//        System.out.println(bicycle.getMake());
//        System.out.println(bicycle.toString());

    }
}
