package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Review03 {
    public static void main(String[] args) {

        goAndReadTheFile();
    }

    public static void goAndReadTheFile(){
        String filePath = "src/day27exception/file01.txt";
        try {
            FileInputStream file = new FileInputStream(filePath);
            int k = 0;
            while ((k = file.read()) != -1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.err.println("There is an issue about reaching out the file or existence of the file ==> " + e.getMessage());
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("\n\nConnection with cloud was broken");
        }
    }
}
