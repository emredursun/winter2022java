package day03typecastingwrapperscanner;

public class WrapperClasses01 {

    public static void main(String[] args) {


        // Wrapper Class is the non-primitive form of the primitive data type.
        /*
            1) Java created a new structure by putting some methods into primitive data types, that structure is called "Wrapper Class"
            2)
            boolean ==> Boolean
            char    ==> Character
            byte    ==> Byte
            short   ==> Short
            int     ==> Integer
            long    ==> Long
            float   ==> Float
            double  ==> Double

            3) Wrapper Classes are non-primitive, and they stored in Heap Memory
         */

        // How to convert primitive to wrapper classes: Autoboxing
        char c = 'd';
        Character wc = c;

        int i = 12;
        Integer wi = i;

        float f = 1.2f;
        Float wf = f;

        // How to convert wrapper classes to primitive data types: Unboxing
        Short s = 23;
        short ps = s;


        // Find min and max value of byte and int data types?

        System.out.println(Byte.MAX_VALUE);  // Max: 127
        System.out.println(Byte.MIN_VALUE); // Min: -128

        System.out.println(Integer.MAX_VALUE);  // Max: 2147483647
        System.out.println(Integer.MIN_VALUE); // Min: -2147483648

        // Find the sum of max value of short and min value of long

        System.out.println(Short.MAX_VALUE + Long.MIN_VALUE); // Result: -9223372036854743041

    }

}
