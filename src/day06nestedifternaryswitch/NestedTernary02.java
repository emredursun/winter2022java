package day06nestedifternaryswitch;

public class NestedTernary02 {
    public static void main(String[] args) {

        /*
            Type code to check password
            If it has more than 8 characters, initial should be 'i'   => 1a1b3c4dxz
            If it has no more than 8 characters, initial should be 'K' and last character should be '!' => Ka1b3c!

            Solve the task by using Nested-Ternary

            // length(): method return the number of characters in a string
            // For example "Abi Can".length() ==> 7

         */

        String pwd = "Ka1b3c!";

        int lengthPWD = pwd.length();
        char initialChar = pwd.charAt(0);
        char lastChar = pwd.charAt((lengthPWD - 1));


        String isValid = (lengthPWD > 8) ? (initialChar == 'i' ? "Valid password!" : "Invalid password!") : (initialChar == 'K' && lastChar == '!' ? "Valid password" : "Invalid password");

        System.out.println(isValid);

    }
}
