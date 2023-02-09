package practice06;

public class Runner {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2);

        System.out.println("Circle Radius: " + circle1.getRadius());

        System.out.println("Circle Area: " + circle1.getArea());

        System.out.println("===========================");

        Circle circle2 = new Circle(-2);

        System.out.println("Circle Radius: " + circle2.getRadius());

        System.out.println("Circle Area: " + circle2.getArea());

        System.out.println("===========================");
        System.out.println("===========================");

        Cylinder cylinder1 = new Cylinder(2, 5);

        System.out.println("Circle Radius: " + cylinder1.getRadius());

        System.out.println("Circle Radius: " + cylinder1.getHeight());

        System.out.println("Circle Area: " + cylinder1.getVolume());

        System.out.println("===========================");

        Cylinder cylinder2 = new Cylinder(2, -5);

        System.out.println("Circle Radius: " + cylinder2.getRadius());

        System.out.println("Circle Radius: " + cylinder2.getHeight());

        System.out.println("Circle Area: " + cylinder2.getVolume());

    }
}
