package day26exception;

public class Review04 {
    public static void main(String[] args) {
        String str = "123";
        convertStringToInteger(str);

        String str01 = "123a";
        convertStringToInteger(str01); // NumberFormatException ==> For input string: "123a"
    }

    public static void convertStringToInteger(String str){
        try {
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.err.println("String could not convert to an int ==> " + e.getMessage());
        }

    }
}
