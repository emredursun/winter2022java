package interfacemanipulations;

public interface Vehicle {

    public default void move(){
        System.out.println("All vehicles should move..");
    }

    public static void staticMove(){

        System.out.println("All vehicles should move better..");
    }

}

/*
Java Abstraction
	abstract class
	encapsulation
	Inheritance
	abstraction
	polymorphism
	Animal animal = new Cat();
	How much would you rate yourself out of 10 in Java?
	5-6-78
	I know Core Java
	String manipulations
	Data structures(Collections and Maps)
	OOP Concept
	execptions
	public class Car extends Engine, AirCondition
	public  Interface  Animal{
		public int eat();
	}
	public Interface Mammal(){
		public int eat();
	}
	public class Cat  implements Animal,Mammal (){
		//this return String
		public int eat(   ){}; //Override, it will return int
		Signature: order of parameters
				   number of parameters
				   type of parameters
	}
	Interface uses abstract key work for Interface name
	No need for abstract key work
	Interface can have constructor
	No and no need to try to initialize variables as they are final
	Abstract class needs abstract key word
	yes
	Abstract class can have concrete and abstract methods
	yes
	Abstract class can have constructors
	abstract class can have final, static, private variables
	yes
	Interface can have final, static, public variables
	yes
	Interface can have default, private protected variables
	no
	Interface can have concrete methods other than default and static
	Interface and abstract class cannot create objects
	yes
	Difference between an Interface and abstract class?
	Interface cannot have any constructor, but abstract class can have constructors
	Interface can be implemented many times(multiple inheritance) , but Abstract classs cannot have multiple Inheritance.
	Interface is fullly abstraction and cannot use all concrete methods, but Abstract has  asbtract methods and concrete methods
	difference between an Abstract class and a concrete class?
	Concrete class can produce Object, but we cannot create Object from abstract class
	Concrete class has concrete methods, but Abstract class has concrete and abstract methods
 */