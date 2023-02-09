package day02datatypes;

public class DataTypes01 {

    /*
        What is the difference between "primitive" and "non-primitive" data types?
        1) Primitive data types contain just value, non-primitive data types contain value + method
        2) Primitive data types names use just lowercase characters, but non-primitive data types names use uppercase at the beginning
        3) Primitive data types were created by Java, developers cannot create primitive data types. But non-primitive data types can be created by Java and by any developer.
        4) Non-primitive data types uses same size area in memory, but primitive data types use different size area in memory.
     */

    public static void main(String[] args) {

        // Primitive data types: boolean, char, byte, short, int, long, float, double

        // 1)Boolean: boolean has 2 values which are true or false. A boolean variable uses just a bit in the memory.
        boolean isRetired = true;
        boolean isOld = false;

        // 2) char: char is for just a single character. It uses 16 bits(2 bytes) in the memory.
        char initial = 'A';

        // 3) byte: byte is for whole numbers between -128 and 127. It uses 8 bits(1 byte) in the memory.
        byte age = 14; // Students ages
        byte mathGrades = 76;

        // 4) short: short is for whole numbers between -32768 and 32767. It uses 16 bits(2 byte) in the memory.
        short numberOfStudentsInASchool = 2134;

        // 5) int: int is for whole numbers between -2,147,483,648 and 2,147,483,647. It uses 32 bits(4 byte) in the memory.
        int annualProfitOfApple = 2000000000;

        // 6) long: long is for whole numbers between -9,223,372,036,854,755,808 and 9,223,372,036,854,755,807. It uses 64 bits(8 byte) in the memory.
        // Do not forget to put "L" to the end of the value in long data type!
        long populationOfTheWorld = 7000000000L;

        // 7) float: float is for decimal numbers. It uses 32 bits(4 byte) in the memory.
        // In float , decimal part can have up to 7 digits!
        // Do not forget to put "F" to the end of the value in float data type!
        float priceOfShirt = 12.99F;

        // 7) double: double is for decimal numbers. It uses 64 bits(8 byte) in the memory.
        // In double , decimal part can have up to 16 digits!
        double listingPrice = 12.981769543856;



        // Non-Primitive Data: String
        String s = "Ali";

        // To convert the data of s to Upper Case
        System.out.println(s.toUpperCase()); // ALI

        // To convert the data of s to Lower Case
        System.out.println(s.toLowerCase()); // ali

    }

}
