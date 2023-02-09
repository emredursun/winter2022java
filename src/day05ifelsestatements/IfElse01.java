package day05ifelsestatements;

public class IfElse01 {
    public static void main(String[] args) {

        //  || and &&

        // value1 and value2
        // true     true =>  true
        // true     false => true
        // fasle    true => true
        // false    false => false

        // I can move from North Carolina to Virginia by a car or bus

        boolean doIHaveACar = true;
        boolean doIHaveABus = false;

        if(doIHaveACar || doIHaveABus){
            System.out.println("Yes I can go to Virginia! (True) ");
        }

        boolean doIHaveACar1 = false;
        boolean doIHaveABus1 = false;

        if(doIHaveACar1 || doIHaveABus1){
            System.out.println("Yes I can go to Virginia! (True) ");
        } else {
            System.out.println("I can not go to Virginia! (False)");
        }

    }
}
