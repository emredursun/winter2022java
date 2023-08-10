package day27exception;

public class Review02 {
    public static void main(String[] args) {

        Object obj = 70;

        convertObjectToString(obj); // ClassCastException ==> Integer cannot be cast to String
    }

    public static void convertObjectToString(Object obj){
        try {
            String s = (String)obj;
            System.out.println(s);
        } catch (ClassCastException e) {
            System.err.println("Conversion is impossible between those data types ==> " + e.getMessage());
        }

    }
}
