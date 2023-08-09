package day26exception;

public class Review03 {
    public static void main(String[] args) {
        String str = "";
        getNumberOfCharactersInAString(str); // 0

        String str01 = "Ali";
        getNumberOfCharactersInAString(str01);

        String str02 = null;
        getNumberOfCharactersInAString(str02);
    }

    public static void getNumberOfCharactersInAString(String str){
        try {
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.err.println("Issue occurred when the method counts the number of characters ==> " + e.getMessage());
//            e.printStackTrace(); // Developer prefers this method to see error in more details
        }

    }
}
