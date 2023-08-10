package day27exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Review04 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/day27exception/file01.txt";
        FileInputStream file = new FileInputStream(filePath);
        int k = 0;
        while ((k = file.read()) != -1){
            System.out.print((char) k);
        }

        System.out.println("\n===================================");

        printTheAge(5);
        printTheAge(-11); // IllegalArgumentException
    }

    public static void printTheAge(int age){
        if(age>=0){
            System.out.println(age);
        }else{
            throw new IllegalArgumentException("Ages cannot be negative...");
        }
    }
}
