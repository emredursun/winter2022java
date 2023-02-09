package day06nestedifternaryswitch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchStatement04 {
    /*
        Ask user to enter country name among “America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France”
	 	Type code to print abbreviation of the countries. “US, UK, DE, TR, IN, PE, ES, BG, AL, FR”
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a country name among “America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France”");
        String country = scan.next().toLowerCase();
        //Note: If you want the switch statement work with case-insensitive a)use toLowerCase() and b)make cases in switch lowercase
        switch (country){
            case "america":
                System.out.println("Code abbreviation for " + country + " is US" );
                break;
            case "england":
                System.out.println("Code abbreviation for " + country + " is UK" );
                break;
            case "germany":
                System.out.println("Code abbreviation for " + country + " is DE" );
                break;
            case "turkey":
                System.out.println("Code abbreviation for " + country + " is TR" );
                break;
            case "india":
                System.out.println("Code abbreviation for " + country + " is IN" );
                break;
            case "peru":
                System.out.println("Code abbreviation for " + country + " is PE" );
                break;
            case "spain":
                System.out.println("Code abbreviation for " + country + " is ES" );
                break;
            case "bulgaria":
                System.out.println("Code abbreviation for " + country + " is BG" );
                break;
            case "albania":
                System.out.println("Code abbreviation for " + country + " is AL" );
            break;
            case "france":
                System.out.println("Code abbreviation for " + country + " is FR" );
                break;
            default:
                System.out.println("We do not know the abbreviation of the given country!");

        }


    }
}
