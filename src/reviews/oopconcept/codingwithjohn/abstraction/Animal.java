package reviews.oopconcept.codingwithjohn.abstraction;

public abstract class Animal {

    int age;
    String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public void printName(){
        System.out.println("My name is " + name);
    }
}
