package interfacemanipulations;

public interface AirCondition {

    /*

    Interface is not a class, but it is an Interface
    A class should be able to use multiple Interface as parent
    In an Interface, most methods are abstract, but we can still use some concrete methods that are static and default
    We do not need to use abstract key word for an Interface(for Interface name)
    If we use a variable in an Interface, we need to assign it to a value
    In abstract class we can have constructors, but in Interface we can not have Constructors
    Interface can not have concrete method other than default and static, but abstract class can have!
    In Java, when we use final variables, the name of variables should be written in uppercase letters
     */

    String MAKE = "Samsung";

    public abstract void electronicAc();

    public void climateAc();

    void bacteriaKiller();

    void run();

    public default int power(){
        System.out.println("Hybrid engines are increasing their powers...");
        return 1000;
    };

    public static String model(){
        System.out.println("The best model...");
        return "The best...";
    }

}
