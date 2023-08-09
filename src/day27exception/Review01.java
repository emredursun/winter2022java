package day27exception;

public class Review01 {
    public static void main(String[] args) {
        String s1 = "Hello!";

        getCharacterFromAStringByIndex(s1, 2); // l
        getCharacterFromAStringByIndex(s1, 6); // StringIndexOutOfBoundsException ==> String index out of range: 6

        divideTheLengths(s1, 1, 7, 3); // An issue occurred in character selection ==> begin 1, end 7, length 6
        divideTheLengths(s1, 1, 5, 1); // An issue occurred in division ==> / bypull zero

    }

    public static void getCharacterFromAStringByIndex(String str, int idx){
        try {
            System.out.println(str.charAt(idx));
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("An issue occurred in character selection ==> " + e.getMessage());
        }
    }

    public static void divideTheLengths(String str, int idx1, int idx2, int idx3){
        try {
            int firstLength = str.substring(idx1, idx2).length();
            int secondLength = str.substring(idx1, idx3).length();
            System.out.println(firstLength / secondLength);
        } catch(ArithmeticException e){
            System.err.println("An issue occurred in division ==> " + e.getMessage());
        }catch(StringIndexOutOfBoundsException e){
            System.err.println("An issue occurred in character selection ==> " + e.getMessage());
        }
    }
}
